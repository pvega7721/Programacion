package ejercicio9.services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ejercicio9.modelo.Persona;

public class PersonasService {
	private OpenConnection openConn;

	public PersonasService() {
		openConn = new OpenConnection();
	}

	Scanner sc = new Scanner(System.in);

	public void borrarPersonasA() throws SQLException {
		Integer personasBorradas = 0;
		// recorrer lista de verTabla
		List<Persona> personas = verTabla();

		for (int i = 0; i < personas.size(); i++) {
			// Llamamos al método mayorEdad para comprobar que sean mayores de edad
			Boolean esMayorEdad = personas.get(i).mayorEdad(personas.get(i));
			// En caso que la persona sea mayor de edad, se le elimina de la tabla
			if (esMayorEdad) {
				borrarPersona(personas.get(i).getDNI());
				personasBorradas++;
			}
			// Imprimimos el número de personas que han sido borradas
			System.out.println(personasBorradas);
		}

	}

	// Devuelve una lista con todas las personas de la tabla
	public List<Persona> verTabla() throws SQLException {
		ResultSet rs = null;
		List<Persona> personas = new ArrayList<>();
		try (Connection conn = openConn.getNetworkConnection(); Statement stmt = conn.createStatement()) {
			String sql = "SELECT * FROM PERSONAS";
			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Persona p1 = getPersonaFromResultSet(rs);
				personas.add(p1);
			}
			return personas;

		}
	}

	// consultar una persona a través de su DNI
	public Persona consultarPersona(String dni) throws SQLException {

		ResultSet rs = null;
		try (Connection conn = openConn.getNetworkConnection(); Statement stmt = conn.createStatement()) {
			System.out.println(dni);
			String sql = "SELECT * FROM personas WHERE DNI = '" + dni + "'";
			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				return getPersonaFromResultSet(rs);
			} else {
				return null;
			}
		}
	}

	// Buscar a todas las personas que tengan el mismo nombre o apellidos
	public List<Persona> buscarPersonas(String filtro) throws SQLException {
		ResultSet rs = null;
		List<Persona> personas = new ArrayList<>();
		try (Connection conn = openConn.getNetworkConnection(); Statement stmt = conn.createStatement()) {
			String sql = "SELECT * FROM PERSONAS WHERE NOMBRE LIKE '%" + filtro + "%' OR APELLIDOS LIKE '%" + filtro
					+ "%'";
			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Persona p1 = getPersonaFromResultSet(rs);
				personas.add(p1);
			}
			return personas;

		}
	}

	// Inserta una persona en la tabla
	public void insertarPersona(Persona p) throws SQLException {
		String sql = "INSERT INTO PERSONAS VALUES (?, ?, ?, ?)";
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, p.getDNI());
			stmt.setString(2, p.getNombre());
			stmt.setString(3, p.getApellidos());
			stmt.setDate(4, Date.valueOf(p.getFechaNacimiento()));

			System.out.println(sql);
			stmt.execute();
		}
	}

	// Dado un DNI, modifica los datos de esa persona
	public void actualizarPersona(Persona persona) throws SQLException {
		String sql = "UPDATE PERSONAS SET NOMBRE = ?, APELLIDOS = ?, FECHA_NACIMIENTO = ? WHERE DNI = ?";
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, persona.getNombre());
			stmt.setString(2, persona.getApellidos());
			stmt.setDate(3, Date.valueOf(persona.getFechaNacimiento()));
			stmt.setString(4, persona.getDNI());
			System.out.println(sql);
			stmt.execute();
		}
	}

	// Elimina a una persona de la tabla
	public void borrarPersona(String dni) throws SQLException {

		String sql = "DELETE * FROM PERSONAS WHERE DNI = ?";

		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			// Indico el valor que debe tomar "?"
			stmt.setString(1, dni);
			System.out.println(sql);
			stmt.execute();
		}
	}

	// Añade una lista de personas a la tabla
	public void insertarLista(List<Persona> personas) throws SQLException {
		String sql = "INSERT INTO PERSONAS VALUES (?, ?, ?, ?)";
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			// Ponemos a false el autoCommit para hacerlo manualmente
			conn.setAutoCommit(false);
			try {
				for (int i = 0; i < personas.size(); i++) {
					stmt.setString(1, personas.get(i).getDNI());
					stmt.setString(2, personas.get(i).getNombre());
					stmt.setString(3, personas.get(i).getApellidos());
					stmt.setDate(4, Date.valueOf(personas.get(i).getFechaNacimiento()));

					System.out.println(sql);
					stmt.execute();
				}

				// Al terminar ponemos commit para confirmar los cambios en la BBDD
				conn.commit();
			} catch (SQLException e) {
				// En caso que haya algún error, hacemos rollback para que la BBDD quede como
				// estaba
				conn.rollback();
				throw e;
			}

		}
	}

	private Persona getPersonaFromResultSet(ResultSet rs) throws SQLException {
		Persona p = new Persona();
		p.setNombre(rs.getString("NOMBRE"));
		p.setDNI(rs.getString("DNI"));
		p.setApellidos(rs.getString("APELLIDOS"));
		p.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
		return p;
	}
}
