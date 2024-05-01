package ejercicio3.services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejercicio3.modelo.Persona;

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

	/**
	 * public void insertarPersona(Persona p) throws SQLException {
	 * 
	 * Boolean error = false; p = new Persona(); do { System.out.println("Indica el
	 * DNI de la persona;"); String dni = sc.nextLine(); p.setDNI(dni);
	 * 
	 * System.out.println("Indica el nombre de la persona;"); String nombre =
	 * sc.nextLine(); p.setNombre(nombre);
	 * 
	 * System.out.println("Indica los apellidos de la persona;"); String apellidos =
	 * sc.nextLine(); p.setApellidos(apellidos);
	 * 
	 * System.out.println("Indica la fecha de nacimiento de la persona;"); String
	 * fecha = sc.nextLine();
	 * 
	 * DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyy");
	 * 
	 * try { LocalDate fechaNacimiento = LocalDate.parse(fecha, format);
	 * p.setFechaNacimiento(fechaNacimiento); } catch (DateTimeParseException e) {
	 * System.out.println("La fecha indicada no es correcta"); error = true; }
	 * 
	 * if (!error) { try { p.validar(); } catch (DatosIncompletosException e) {
	 * System.out.println("Los datos están incompletos"); error = true; } } } while
	 * (error);
	 * 
	 * 
	 * }
	 **/
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

	private Persona getPersonaFromResultSet(ResultSet rs) throws SQLException {
		Persona p = new Persona();
		p.setNombre(rs.getString("NOMBRE"));
		p.setDNI(rs.getString("DNI"));
		p.setApellidos(rs.getString("APELLIDOS"));
		p.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
		return p;
	}
}
