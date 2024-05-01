package ej3Repaso.services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ej3Repaso.modelo.Persona;

public class PersonasService {
	private OpenConnection openConn;

	public PersonasService() {
		openConn = new OpenConnection();
	}

	// los scanner en el main
	Scanner sc = new Scanner(System.in);

	public void insertarPersona(Persona p) throws SQLException {
		String sql = "INSERT INTO PERSONAS VALUES (?, ?, ?, ?)";
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			System.out.println("Introduce el nombre o apellido buscados");
			// Datos de la persona
			stmt.setString(1, p.getDNI());
			stmt.setString(2, p.getNombre());
			stmt.setString(3, p.getApellidos());
			stmt.setDate(4, Date.valueOf(p.getFechaNacimiento()));

			stmt.execute(sql);

			System.out.println(sql);

		} catch (SQLException e) {
			System.err.println("Error al acceder a la BBDD");
		}
	}

	public List<Persona> buscarPersonas() throws SQLException {
		// La consulta no lleva ";"
		// El "%" va en el filtro, no en la consulta

		String sql = "SELECT * FROM PERSONAS WHERE NOMBRE LIKE ? OR APELLIDOS LIKE ?";
		List<Persona> personas = new ArrayList<>();
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			System.out.println("Introduce el nombre o apellido buscados");
			String filtro = sc.nextLine();
			stmt.setString(1, "%" + filtro + "%");
			stmt.setString(2, "%" + filtro + "%");
			ResultSet rs = stmt.executeQuery();
			try {
				System.out.println(sql);
				// Mientas haya resultados, los añade a la lista e imprime la consulta
				while (rs.next()) {
					personas.add(getPersonaFromResultSet(rs));
				}
				return personas;

			} finally {
				rs.close();
			}

		} catch (SQLException e) {
			System.err.println("Error al acceder a la BBDD");
			return null;
		}
	}

	public Persona consultarPersona() throws SQLException {
		String sql = "SELECT * FROM PERSONAS WHERE DNI = ?";

		try (Connection conn = openConn.getNetworkConnection();
				// En este caso hay que importar PreparedStatement para pedir datos con "?"
				PreparedStatement stmt = conn.prepareStatement(sql)) {

			// Solicitamos al usuario el dni de la persona
			System.out.println("Introduce el dni de la persona que buscas");
			String dni = sc.nextLine();
			// Indicamos el valor que debe tomar "?"
			stmt.setString(1, dni);

			// Ejecutamos el statement
			// Resulset es para leer el resultado
			ResultSet rs = stmt.executeQuery();
			try {
				/*
				 * En caso que rs.next sea true, osea que haya resultados en la BBDD, devuelve
				 * los datos de esta, en caso contrario devolverá null
				 */
				if (rs.next()) {
					System.out.println(sql);
					return getPersonaFromResultSet(rs);
				} else {
					return null;
				}
			} finally {
				rs.close();
			}

		} catch (SQLException e) {
			System.err.println("Error al acceder a la base de datos");
			return null;
		}
	}

	// Método para obtener los datos de una persona.
	private Persona getPersonaFromResultSet(ResultSet rs) throws SQLException {
		Persona p = new Persona();
		p.setNombre(rs.getString("NOMBRE"));
		p.setDNI(rs.getString("DNI"));
		p.setApellidos(rs.getString("APELLIDOS"));
		p.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
		return p;
	}

}
