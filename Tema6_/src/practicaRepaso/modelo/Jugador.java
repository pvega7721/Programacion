package practicaRepaso.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Jugador {
	private Integer numero;
	private String codigo_equipo;
	private String nombre;
	private LocalDate fechaNacimiento;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCodigo_equipo() {
		return codigo_equipo;
	}

	public void setCodigo_equipo(String string) {
		this.codigo_equipo = string;
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
		return "Jugador [numero=" + numero + ", codigo_equipo=" + codigo_equipo + ", nombre=" + nombre
				+ ", fechaNacimiento=" + format.format(fechaNacimiento) + "]\n";
	}

}
