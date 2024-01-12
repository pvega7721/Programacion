package ejercicio22;

public class Alumno extends Persona{
	private String dni; 
	private Double nota;
	
	public Alumno(String dni, Double nota) {
		super();
		this.dni = dni;
		this.nota = nota;
	}
	
	public Alumno(String dni) {
		super();
		this.dni = dni;
	}

	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dniNuevo) {
		this.dni=dniNuevo;
	}
	
	public void aprobar() {
		this.nota = 5.00;
	}
	
}
