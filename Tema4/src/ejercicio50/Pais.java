package ejercicio50;

import java.util.Objects;

public class Pais {
	//Añado atributos
	private String codigo;
	private String descripcion;
	
	//Constructor único que reciba los dos atributos (Click derecho-source)
	public Pais(String codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	
	
	//Creo métodos get y set
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	

	//añado toString()
	@Override
	public String toString() {
		return "Pais [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}

	//Método equals
	@Override
	public int hashCode() {
		return Objects.hash(codigo.toUpperCase());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return Objects.equals(codigo.toUpperCase(), other.codigo.toUpperCase());
	}
	
	
	
	
}

