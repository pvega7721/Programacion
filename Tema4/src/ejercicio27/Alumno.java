package ejercicio27;

import java.util.Objects;

public class Alumno extends Persona{
	private String dni; 
	private Double nota;
	//Añado atributo curso a la clase Alumno
	private	Curso curso;
	
	public Alumno(String dni) {
		super();
		//Hacemos el if para que no de error en caso de que dni sea null.
		if (dni !=null) {
			dni=dni.toUpperCase();
		}
		this.dni = dni;
	}

	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	//añadir Get y Set
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
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
	
	//Pasamos dni a mayúscula
	public void setDni(String dni) {
		if (dni!= null) {
			dni=dni.toUpperCase();
		}
		this.dni=dni;
	}
	
	
	public void aprobar() {
		this.nota = 5.00;
	}
	public Boolean validarDNI() {
		if (dni.isEmpty() || dni.equals(null) && dni.length()!=9) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nota=" + nota + ", nombre=" + getNombre()
		+ ", edad=" + getEdad() + ", curso=" + curso + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}

	
	
}
