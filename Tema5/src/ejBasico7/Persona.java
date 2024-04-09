package Tema5.src.ejBasico7;

import java.math.BigDecimal;

public class Persona {
	public String genero;
	public BigDecimal altura;
	
	public Persona(String genero, BigDecimal altura) {
		this.genero = genero;
		this.altura = altura;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

}
