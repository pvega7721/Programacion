package ejercicio18;

public class Alumno {
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	private String dni; 
	private String nombre;
	private int edad;
	private Double nota;
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dniNuevo) {
		this.dni=dniNuevo;
	}
	
}
