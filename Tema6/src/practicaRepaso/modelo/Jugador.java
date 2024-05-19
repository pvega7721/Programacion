package practicaRepaso.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Jugador {
	private Integer numero;
	private String codigoEquipo;
	private String nombre;
	private LocalDate fechaNacimiento;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCodigoEquipo() {
		return codigoEquipo;
	}

	public void setCodigoEquipo(String string) {
		this.codigoEquipo = string;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Jugador [numero=" + numero + ", codigo_equipo=" + codigoEquipo + ", nombre=" + nombre
				+ ", fechaNacimiento=" + format.format(fechaNacimiento) + "]\n";
	}

}
