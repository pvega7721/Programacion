package examen.services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import examen.modelo.Pelicula;

public class PeliculasService {
	private OpenConnection openConn;

	public PeliculasService() {
		openConn = new OpenConnection();
	}

	public List<Pelicula> consultarPeliculas(LocalDate fechaInicial, LocalDate fechaFinal)
			throws PeliculaErrorException {
		String sql = "select * from peliculas where estreno BETWEEN ? AND ?";
		List<Pelicula> listaPeliculas = new ArrayList<>();
		try (Connection conn = openConn.getNetworkConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setDate(1, Date.valueOf(fechaInicial));
			stmt.setDate(2, Date.valueOf(fechaFinal));
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				listaPeliculas.add(getPeliculaFromResultSet(rs));
			}
			if (listaPeliculas.isEmpty()) {
				//Debe lanzar PeliculaNotFoundException
				throw new PeliculaErrorException("No hay películas para estas fechas");
			}
			return listaPeliculas;
		} catch (SQLException e) {
			System.out.println("Error consultando películas");
			throw new PeliculaErrorException("No hay películas para estas fechas");
		}
	}

	private Pelicula getPeliculaFromResultSet(ResultSet rs) throws SQLException {
		//btudo: este constructor no debe existir, el que tienes es con el titulo como parametro.
		Pelicula p = new Pelicula();
		p.setTitulo(rs.getString("TITULO_PELICULA"));
		p.setDuracion(rs.getInt("DURACION"));
		p.setFechaInicioRodaje(rs.getDate("FECHA_COMIENZO").toLocalDate());
		p.setFechaEstreno(rs.getDate("ESTRENO").toLocalDate());
		p.setPresupustoInicial(rs.getBigDecimal("PRESUPUESTO_INICIAL"));
		p.setRecaudacion(rs.getBigDecimal("RECAUDACION_ACUMULADA"));
		return p;
	}

}
