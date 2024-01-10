package ejercicio21;

public class Alumno extends Persona{
	private String dni; 
	private String nombre;
	private Integer edad;
	private Double nota;
	
	public Alumno(String dni, String nombre, int edad, Double nota) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.nota = nota;
	}
	
	public Alumno(String dni) {
		super();
		this.dni = dni;
	}

	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
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
