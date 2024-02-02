package ejercicio43;

public abstract class Persona {
	private String nombre;
	private Integer anoNacimiento;
	private String nacionalidad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getAnoNacimiento() {
		return anoNacimiento;
	}
	public void setAnoNacimiento(Integer anoNacimiento) {
		this.anoNacimiento = anoNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public abstract Integer getSueldo() {
		
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", anoNacimiento=" + anoNacimiento + ", nacionalidad=" + nacionalidad
				+ "]";
	}
	
	
}
