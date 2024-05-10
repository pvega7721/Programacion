package examen.services;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import examen.modelo.Libro;

public class LibreriaService {
	private OpenConnection openConn;

	public LibreriaService() {
		openConn = new OpenConnection();
	}

	public void insertarLibroNuevo(Libro l) throws LibroException {
		String sql = "INSERT INTO libros VALUES( ?, ?, ?, ?)";
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, l.getIsbn());
			stmt.setString(2, l.getTitulo());
			stmt.setString(3, l.getAutor());
			stmt.setBigDecimal(4, l.getPrecio());
			System.out.println(sql);
			stmt.execute();
			System.out.println("Libro insertado correctamente");

		} catch (SQLException e) {
			throw new LibroException("Error al acceder a la BBDD");
		}
	}

	public void insertarLibroSegundaMano(Libro l) throws SQLException, LibroException {
		insertarLibroNuevo(l);
	}

	// no funciona
	public Boolean actualizarPrecioLibroNuevo(Libro l) throws SQLException, LibroException {
		String sql = "UPDATE libros set PRECIO = ? WHERE ISBN = ?";
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setBigDecimal(1, l.getPrecio());
			stmt.setString(2, l.getIsbn());
			stmt.execute();
			System.out.println(sql);
			System.out.println("Libro modificado correctamente");
			return true;
		} catch (SQLException e) {
			throw new LibroException("Error al acceder a la BBDD");
		}
	}

	private Libro getLibroFromResultSet(ResultSet rs) throws SQLException {
		Libro l = new Libro();
		l.setIsbn(rs.getString("ISBN"));
		l.setAutor(rs.getString("TITULO"));
		l.setAutor(rs.getString("AUTOR"));
		l.setPrecio(rs.getBigDecimal("PRECIO"));
		return l;
	}
}
