package practicaRepaso.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private String codigo;
	private String nombre;
	private List<Jugador> listaJugadores;

	public Equipo() {
		this.listaJugadores = new ArrayList<>();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(List<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	public BigDecimal getEdadMedia(List<Jugador> listaJugadores) {
		Integer sumaEdad = 0;
		BigDecimal edadMedia = BigDecimal.ZERO;
		LocalDate fechaActual = LocalDate.now();
		try {

			for (Jugador jugador : listaJugadores) {
				Period periodo = jugador.getFechaNacimiento().until(fechaActual);
				Integer edad = periodo.getYears();
				sumaEdad += edad;
			}
			BigDecimal edadTotal = new BigDecimal(sumaEdad);
			BigDecimal numJugadores = new BigDecimal(listaJugadores.size());
			edadMedia = edadTotal.divide(numJugadores);
			return edadMedia;
		} catch (ArithmeticException e) {
			System.out.println("La lista está vacía");
			return null;
		}

	}

	@Override
	public String toString() {
		return "Equipo: " + codigo + "/" + nombre +  "]\n";
	}

}
