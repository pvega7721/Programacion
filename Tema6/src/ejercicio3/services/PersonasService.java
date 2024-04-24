package ejercicio3.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ejercicio3.modelo.Persona;

public class PersonasService {
	private OpenConnection openConn;

	public PersonasService() {
		openConn = new OpenConnection();
	}

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

	public List<Persona> buscarPersonas(String filtro) throws SQLException {
		ResultSet rs = null;
		List<Persona> personas = new ArrayList<>();
		try (Connection conn = openConn.getNetworkConnection(); Statement stmt = conn.createStatement()) {
			String sql = "SELECT * FROM PERSONAS WHERE NOMBRE LIKE '%" + filtro + "%' OR APELLIDOS LIKE '%" + filtro
					+ "%'";
			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			if (personas.isEmpty()) {
				return null;
			} else {
				while (rs.next()) {
					Persona p1 = getPersonaFromResultSet(rs);
					personas.add(p1);
				}
				return personas;
			}
		}
	}

<<<<<<< HEAD
	// Ejercicio3
=======
>>>>>>> branch 'main' of https://github.com/pvega7721/Programacion.git
	public void insertarPersona(Persona p) throws SQLException {
<<<<<<< HEAD
		try (Connection conn = openConn.getNetworkConnection(); Statement stmt = conn.createStatement()) {
			String sql = "INSERT INTO PERSONAS (DNI, NOMBRE, APELLIDOS, FECHA_NACIMIENTO) values ('" + p.getDNI()
					+ "', '" + p.getNombre() + "', '" + p.getApellidos() + "', '" + p.getFechaNacimiento() + "')";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			if (pstmt.executeUpdate() == 1) {
				System.out.println("Persona insertada correctamente");
			} else {
				System.out.println("Persona no insertada");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
=======
		String sql = "INSERT INTO PERSONAS VALUES (?, ?, ?, ?)";
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

>>>>>>> branch 'main' of https://github.com/pvega7721/Programacion.git
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
