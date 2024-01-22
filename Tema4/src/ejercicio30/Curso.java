package ejercicio30;

public class Curso {
	private Long identificador;
	private String descripcion;
	private Alumno[] alumnos;
	
	
	for(int i=0;i<alumnos.length;i++) {
		if(alumnos[i] == null) {
			alumnos[i] =alumno;
			return;
		}
	}
	
	
	public Long getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Curso [identificador=" + identificador + ", descripcion=" + descripcion + "]";
	}
	
}
