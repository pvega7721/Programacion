package ejercicio3.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ejercicio3.services.DatosIncompletosException;

public class Persona {
	private String DNI;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
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

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Boolean validar() throws DatosIncompletosException {
		if (DNI.isEmpty() || nombre.isEmpty() || apellidos.isEmpty() || fechaNacimiento == null) 
			throw new DatosIncompletosException();
		
		return true;
	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyy");
		return "Persona [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ formato.format(fechaNacimiento) + "]";
	}

}
