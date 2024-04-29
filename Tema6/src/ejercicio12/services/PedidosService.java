package ejercicio12.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ejercicio12.modelo.Pedido;
import ejercicio12.modelo.PedidoLinea;

public class PedidosService {
	// Siempre hay que abirir la conexión
	private OpenConnection openConn;

	public PedidosService() {
		openConn = new OpenConnection();
	}

	public List<PedidoLinea> consultarLineasPedido(Integer numero) throws SQLException {
		List<Pedido> listaPedidos = new ArrayList<>();
		String sql = "SELECT * FROM PEDIDOS_LINEAS WHERE NUMERO_PEDIDO = ?";
		try (Connection conn = openConn.getNetworkConnection(); 
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery(sql);
			
		}
		return listaPedidos;
	}

}
