package ejercicio1.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import ejercicio1.Modelo.Persona;

public class PersonasService {
	private OpenConnection openConn;

	public PersonasService() {
		openConn = new OpenConnection();
	}

	public Persona consultarPersona(String dni) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = openConn.getNetworkConnection();
			stmt = conn.createStatement();
			System.out.println(dni);
			String sql = "SELECT * FROM personas WHERE DNI = '" + dni + "'";
			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				return getPersonaFromResultSet(rs);
			} else {
				return null;
			}

		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
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
