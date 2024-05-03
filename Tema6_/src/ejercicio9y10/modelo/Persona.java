package ejercicio9y10.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ejercicio9y10.services.DatosIncompletosException;

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

	public Boolean esMayorEdad() {
		LocalDate fechaActual = LocalDate.now();
		// Calcula la fecha en la que cumple la mayoría de edad
		LocalDate fechaMayorEdad = this.getFechaNacimiento().plusYears(18);
		//Si la fecha en la que cumple la mayoría de edad es despues de hoy, todavía no es mayor de edad.
		if (fechaMayorEdad.isAfter(fechaActual)) {
			return false;
		} else {
			return true;
		}
	}

	// Este método comprueba que todos los datos estén rellenos, en caso contrario,
	// lanzará la excepción.
	public Boolean validar() throws DatosIncompletosException {
		if (DNI.isEmpty() || nombre.isEmpty() || apellidos.isEmpty() || fechaNacimiento == null) {
			throw new DatosIncompletosException();
		}
		return true;
	}

	public String toString() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Persona [DNI=" + DNI + ", nombre=" + nombre + ", Apellidos=" + apellidos + ", fechaNacimiento="
				+ format.format(fechaNacimiento) + "]\n";
	}

}
