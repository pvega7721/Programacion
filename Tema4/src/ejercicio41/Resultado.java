package ejercicio41;

import java.util.Objects;

public class Resultado {
	//Atributos privados
	private Integer golesLocales;
	private Integer golesVisitante;
	
	public Resultado() {
		super();
		this.golesLocales = 0;
		this.golesVisitante = 0;
	}
	//Métodos get y set de los atributos
	public Integer getGolesLocales() {
		return golesLocales;
	}

	public void setGolesLocales(Integer golesLocales) {
		this.golesLocales = golesLocales;
	}

	public Integer getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(Integer golesVisitante) {
		this.golesVisitante = golesVisitante;
	}
	//Metodo equals que compare los dos atributos
	@Override
	public int hashCode() {
		return Objects.hash(golesLocales, golesVisitante);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resultado other = (Resultado) obj;
		return Objects.equals(golesLocales, other.golesLocales) && Objects.equals(golesVisitante, other.golesVisitante);
	}
	//Método toString que imprima el resultado
	@Override
	public String toString() {
		return golesLocales + " - " + golesVisitante;
	}
	
	
	
}
