package ej2Repaso.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import ej2Repaso.modelo.Persona;

public class PersonasService {
	private OpenConnection openConn;

	public PersonasService() {
		openConn = new OpenConnection();
	}

	Scanner sc = new Scanner(System.in);

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
			}finally {
				rs.close();
			}

		}catch(SQLException e) {
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
