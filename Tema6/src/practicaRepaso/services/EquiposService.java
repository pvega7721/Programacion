package practicaRepaso.services;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import practicaRepaso.modelo.Equipo;
import practicaRepaso.modelo.Jugador;

public class EquiposService {
	private OpenConnection openConn;

	public EquiposService() {
		openConn = new OpenConnection();
	}

	public BigDecimal calcularEdadMediaPlantilla(Equipo eq) {
		Integer edadTotal = 0;
		LocalDate fechaActual = LocalDate.now();
		try {
			for (int i = 0; i < eq.getListaJugadores().size() - 1; i++) {
				LocalDate fechaNac = eq.getListaJugadores().get(i).getFechaNacimiento();
				Period periodo = Period.between(fechaNac, fechaActual);
				Integer edad = periodo.getYears();
				edadTotal += edad;
			}
			BigDecimal edadMedia = new BigDecimal(edadTotal / eq.getListaJugadores().size());
			return edadMedia;
		} catch (ArithmeticException e) {
			System.out.println("No hay jugadores en el equipo");
			return null;
		}
	}

	public List<Equipo> consultarEquipos() throws SQLException, EquipoServiceException {
		String sql = "select * from equipo";
		List<Equipo> equipos = new ArrayList<>();
		try (Connection conn = openConn.getNetworkConnection(); Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery(sql);
			try {
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

	public List<Jugador> consultarJugadoresEquipo(String codigo) throws SQLException {
		String sql = "select * from jugador where codigo_equipo like ?";
		List<Jugador> jugadores = new ArrayList<>();
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, codigo);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				jugadores.add(getJugadorFromResultSet(rs));
			}
			if (jugadores.isEmpty()) {
				System.out.println("No hay jugadores en el equipo");
			}
			return jugadores;

		} catch (SQLException e) {
			System.err.println("Error al acceder a BBDD");
			return null;
		}
	}

	public Equipo consultarEquipoCompleto(String codigo) throws EquipoServiceException, NotFoundException {
		String sql = "select * from equipo where codigo = ?";
		Equipo e1 = new Equipo();
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, codigo);
			ResultSet rs = stmt.executeQuery();
			if (!rs.next()) {
				throw new NotFoundException("No hay equipos con ese código");
			}

			e1 = getEquipoFromResultSet(rs);
			e1.setListaJugadores(consultarJugadoresEquipo(codigo));

		} catch (SQLException e) {
			System.err.println("Error al acceder a BBDD");
			throw new EquipoServiceException();
		}
		return e1;
	}

	public void insertarJugador(Jugador j) throws SQLException {
		String sql = "insert into jugador values(?, ?, ?, ?)";
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, j.getNumero());
			stmt.setString(2, j.getCodigoEquipo());
			stmt.setString(3, j.getNombre());
			stmt.setDate(4, Date.valueOf(j.getFechaNacimiento()));
			stmt.execute();
			System.out.println("Jugador insertado correctamente");
		} catch (SQLException e) {
			System.err.println("Error al acceder a la BBDD");
			throw e;
		}
	}

	public void crearEquipo(Equipo e1) throws SQLException, EquipoServiceException {
		String sql = "insert into equipo values(?, ?)";
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			conn.setAutoCommit(false);
			try {
				// Accede a cada jugador de la lista y les asigna el código del equipo y el
				// número
				for (int i = 0; i < e1.getListaJugadores().size(); i++) {
					e1.getListaJugadores().get(i).setCodigoEquipo(e1.getCodigo());
					e1.getListaJugadores().get(i).setNumero(i);
					// Inserta el jugador en la tabla
					insertarJugador(e1.getListaJugadores().get(i));
				}
				// Inserta el equipo en la BBDD
				stmt.setString(1, e1.getCodigo());
				stmt.setString(2, e1.getNombre());
				stmt.execute();
				conn.commit();
			} catch (SQLException e) {
				conn.rollback();
				throw new EquipoServiceException();
			}

		} catch (SQLException e) {
			System.err.println("Error al acceder a la BBDD");
			throw e;
		}
	}

	public void borrarEquipoCompleto(String codigo) throws SQLException, NotFoundException, EquipoServiceException {
		// Consultas para eliminar los jugadores de la tabla jugador y al equipo de la
		// tabla equipo
		String sql = "delete from jugador where codigo_equipo = ?";
		String sql2 = "delete from equipo where codigo = ?";
		try (Connection conn = openConn.getNetworkConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
				PreparedStatement stmt2 = conn.prepareStatement(sql2)) {
			conn.setAutoCommit(false);
			try {
				stmt.setString(1, codigo);
				stmt.execute();
				stmt2.setString(1, codigo);
				stmt2.execute();
				System.out.println("Equipo eliminado!!");
				conn.commit();
			} catch (SQLException e) {
				conn.rollback();
				throw new NotFoundException();
			} catch (Exception e) {
				conn.rollback();
				throw new EquipoServiceException();
			}
		} catch (SQLException e) {
			System.err.println("Error al acceder a la BBDD");
		}
	}

	public void añadirJugadorAEquipo(Equipo e, Jugador j) throws SQLException, EquipoServiceException {
		// consultar todos los jugadores del equipo para ver cuantos hay
		Integer cantidadJugadores = consultarJugadoresEquipo(e.getCodigo()).size();
		try {
			// Le introduzco al usuario el codigo del equipo
			j.setCodigoEquipo(e.getCodigo());
			// Le introduzco al jugador el número siguiente al último del equipo
			// (Si el último de la lista tiene el 14, este tendrá el 15)
			j.setNumero(e.getListaJugadores().size());
			// Inserto al jugador en la tabla
			insertarJugador(j);
			System.out.println("Jugador insertado");

		} catch (SQLException a) {
			throw new EquipoServiceException();
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
		j.setCodigoEquipo(rs.getString("CODIGO_EQUIPO"));
		j.setNombre(rs.getString("NOMBRE"));
		j.setFechaNacimiento(rs.getDate("NACIMIENTO").toLocalDate());
		return j;
	}
}
