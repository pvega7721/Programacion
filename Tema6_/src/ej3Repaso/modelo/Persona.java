package ej3Repaso.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {
	private String DNI;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String npellidos) {
		this.apellidos = npellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String toString() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Persona [DNI=" + DNI + ", nombre=" + nombre + ", Apellidos=" + apellidos + ", fechaNacimiento="
				+ format.format(fechaNacimiento) + "]\n";
	}

}
