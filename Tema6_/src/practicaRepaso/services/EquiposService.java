package practicaRepaso.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import practicaRepaso.modelo.Equipo;
import practicaRepaso.modelo.Jugador;

public class EquiposService {
	private OpenConnection openConn;

	public EquiposService() {
		openConn = new OpenConnection();
	}

	public List<Equipo> consultarEquipos() throws SQLException, EquipoServiceException {
		String sql = "select * from equipo";
		List<Equipo> equipos = new ArrayList<>();
		try (Connection conn = openConn.getNetworkConnection(); Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery(sql);
			try {
				System.out.println(sql);
				while (rs.next()) {
					equipos.add(getEquipoFromResultSet(rs));
				}
				if (equipos.isEmpty()) {
					System.err.println("No hay equipos");
				}
					return equipos;
				
			} finally {
				rs.close();
			}
		} catch (SQLException e) {
			throw new EquipoServiceException("Error al consultar equipos: " + e.getMessage());
		}
	}
	
	public List<Jugador> consultarJugadoresEquipo(String codigo) throws SQLException{
		String sql = "select * from jugador where codigo_equipo like ?";
		List<Jugador> jugadores = new ArrayList<>();
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, codigo);
			ResultSet rs = stmt.executeQuery();
			try {
				System.out.println(sql);
				while (rs.next()) {
					jugadores.add(getJugadorFromResultSet(rs));
				}
				if(jugadores.isEmpty()) {
					System.err.println("No hay jugadores en el equipo");
				}
				return jugadores;
			}finally {
				rs.close();
			}
		} catch (SQLException e) {
			System.err.println("Error al acceder a BBDD");
			return null;
		}
	}

	private Equipo getEquipoFromResultSet(ResultSet rs) throws SQLException {
		Equipo e = new Equipo();
		e.setCodigo(rs.getString("CODIGO"));
		e.setNombre(rs.getString("NOMBRE"));
		return e;
	}
	
	private Jugador getJugadorFromResultSet(ResultSet rs) throws SQLException {
		Jugador j = new Jugador();
		j.setNumero(rs.getInt("NUMERO"));
		j.setCodigo_equipo(rs.getString("CODIGO_EQUIPO"));
		j.setNombre(rs.getString("NOMBRE"));
		j.setFechaNacimiento(rs.getDate("NACIMIENTO").toLocalDate());
		return j;
	}
}
