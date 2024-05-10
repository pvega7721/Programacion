package ejercicio11.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ejercicio11.modelo.Coche;

public class CochesService {
	private OpenConnection openConn;

	// abrir conexion
	public CochesService() {
		openConn = new OpenConnection();
	}

	public List<Coche> buscarCoches(String marca) throws SQLException {
		String sql = "SELECT * FROM COCHES WHERE MARCA = ?";
		List<Coche> listaCoches = new ArrayList<>();
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, marca);
			ResultSet rs = stmt.executeQuery();
			try {
				System.out.println(sql);
				// Mientas haya resultados, los añade a la lista e imprime la consulta
				while (rs.next()) {
					listaCoches.add(getCocheFromResultSet(rs));
				}
				if (listaCoches.isEmpty()) {
					System.err.println("No hay coches de esa marca");
				} else
					;
				return listaCoches;

			} finally {
				rs.close();
			}

		} catch (SQLException e) {
			System.err.println("Error al acceder a la BBDD");
			return null;
		}
	}

	public void borrarCoche(String matricula) throws SQLException {
		String sql = "DELETE FROM COCHES WHERE MATRICULA = ?";
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, matricula);
			System.out.println(sql);
			stmt.execute();
		} catch (SQLException e) {
			System.err.println("Error al acceder a la BBDD");
		}
	}

	public Coche consultarCoche(String matricula) throws SQLException {
		String sql = "SELECT * FROM COCHES WHERE MATRICULA like ?";
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, matricula);
			ResultSet rs = stmt.executeQuery();
			try {
				if (rs.next()) {
					System.out.println(sql);
					return getCocheFromResultSet(rs);
				} else {
					return null;
				}
			} finally {
				rs.close();
			}
		} catch (SQLException e) {
			System.err.println("Error al acceder a la BBDD");
			return null;
		}
	}

	public void actualizarCoche(Coche c) throws SQLException {
		String sql = "UPDATE COCHES SET MARCA = ?, PRECIO = ?, FECHA_HORA_COMPRA = ? WHERE MATRICULA = ?";
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, c.getMarca());
			stmt.setBigDecimal(2, c.getPrecio());
			stmt.setTimestamp(3, Timestamp.valueOf(c.getFechaHoraCompra()));
			stmt.setString(4, c.getMatricula());
			stmt.execute();
			System.out.println(sql);
			System.out.println("Coche modificado correctamente");

		} catch (SQLException e) {
			System.err.println("Error al acceder a la BBDD");
		}
	}

	public void insertarCoche(Coche c) throws SQLException {
		String sql = "INSERT INTO COCHES VALUES (?, ?, ?, ?)";
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, c.getMatricula());
			stmt.setString(2, c.getMarca());
			stmt.setBigDecimal(3, c.getPrecio());
			stmt.setTimestamp(4, Timestamp.valueOf(c.getFechaHoraCompra()));
			stmt.execute();
			System.out.println(sql);
			System.out.println("Coche insertado correctamente");

		} catch (SQLException e) {
			System.err.println("Error al acceder a la BBDD");
		}
	}

	private Coche getCocheFromResultSet(ResultSet rs) throws SQLException {
		Coche c = new Coche();
		c.setMatricula(rs.getString("MATRICULA"));
		c.setMarca(rs.getString("MARCA"));
		c.setPrecio(rs.getBigDecimal("PRECIO"));
		c.setFechaHoraCompra(rs.getTimestamp("FECHA_HORA_COMPRA").toLocalDateTime());
		return c;
	}

}
