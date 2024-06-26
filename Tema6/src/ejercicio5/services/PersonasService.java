package ejercicio5.services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ejercicio5.modelo.Persona;

public class PersonasService {
	private OpenConnection openConn;

	public PersonasService() {
		openConn = new OpenConnection();
	}

	Scanner sc = new Scanner(System.in);

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
			while (rs.next()) {
				Persona p1 = getPersonaFromResultSet(rs);
				personas.add(p1);
			}
			return personas;

		}
	}
	
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

	public void borrarPersona(String dni) throws SQLException {

		String sql = "DELETE * FROM PERSONAS WHERE DNI = ?";

		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			// Indico el valor que debe tomar "?"
			stmt.setString(1, dni);
			System.out.println(sql);
			stmt.execute();
		}
	}

	public void insertarLista(List<Persona> personas) throws SQLException {
		String sql = "INSERT INTO PERSONAS VALUES (?, ?, ?, ?)";
		try (Connection conn = openConn.getNetworkConnection(); 
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			//Ponemos a false el autoCommit para hacerlo manualmente
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
				
				//Al terminar ponemos commit para confirmar los cambios en la BBDD
				conn.commit();
			}catch(SQLException e) {
				//En caso que haya algún error, hacemos rollback para que la BBDD quede como estaba
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
