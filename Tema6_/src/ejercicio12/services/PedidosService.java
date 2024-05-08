package ejercicio12.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ejercicio11.modelo.Coche;
import ejercicio12.modelo.Pedido;
import ejercicio12.modelo.PedidoLinea;

public class PedidosService {
	// Siempre hay que abirir la conexión
	private OpenConnection openConn;

	public PedidosService() {
		openConn = new OpenConnection();
	}
	//Falta por corregir
	public List<PedidoLinea> consultarLineasPedido(int numero) throws SQLException {
		List<PedidoLinea> listaPedidos = new ArrayList<>();
		String sql = "SELECT * FROM PEDIDOS_LINEAS WHERE NUMERO_PEDIDO = ?";
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, numero);
			ResultSet rs = stmt.executeQuery();
			try {
				System.out.println(sql + numero);
				// Mientas haya resultados, los añade a la lista
				while (rs.next()) {
					listaPedidos.add(getPedidoLineaFromResultSet(rs));
				}
				if (listaPedidos.isEmpty()) {
					System.err.println("Número de pedido inválido");
				}
				return listaPedidos;

			} finally {
				rs.close();
			}
		} catch (SQLException e) {
			System.err.println("Error al acceder a la BBDD");
			return null;
		}
	}

	private PedidoLinea getPedidoLineaFromResultSet(ResultSet rs) throws SQLException {
		PedidoLinea pL = new PedidoLinea();
		pL.setNumero_pedido(rs.getInt("NUMERO_PEDIDO"));
		pL.setArticulo(rs.getString("ARTICULO"));
		pL.setCantidad(rs.getInt("CANTIDAD"));
		pL.setPrecio_unitario(rs.getBigDecimal("PRECIO_UNITARIO"));
		return pL;
	}

	private Pedido getPedidoFromResultSet(ResultSet rs) throws SQLException {
		Pedido p = new Pedido();
		p.setNumero(rs.getInt("NUMERO"));
		p.setCliente(rs.getString("CLIENTE"));
		p.setFecha_entrega(rs.getDate("FECHA_ENTREGA").toLocalDate());
		return p;
	}

}
