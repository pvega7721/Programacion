package ejercicio41;

import java.util.Objects;

public class Resultado {
	//Atributos privados
	private Integer golesLocales;
	private Integer golesVisitante;
	
	//Constructor por defecto inicializado a 0
	public Resultado() {
		super();
		this.golesLocales = 0;
		this.golesVisitante = 0;
	}
	
	//Método
	public Boolean isVictoriaLocal() {
		if(golesLocales>golesVisitante) {
			return true;
		}else 
			return false;
	}
	
	public Boolean isVictoriaVisitante() {
		if(golesVisitante>golesLocales) {
			return true;
		}else
			return false;
	}
	
	public Boolean isEmpate() {
		if(golesVisitante==golesLocales) {
			return true;
		}else
			return false;
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
