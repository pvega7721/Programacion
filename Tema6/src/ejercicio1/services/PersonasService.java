package ejercicio1.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ejercicio1.modelo.Persona;

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

	private Persona getPersonaFromResultSet(ResultSet rs) throws SQLException {
		Persona p = new Persona();
		p.setNombre(rs.getString("NOMBRE"));
		p.setDNI(rs.getString("DNI"));
		p.setApellidos(rs.getString("APELLIDOS"));
		p.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
		return p;
	}
}
