package ejBasico6;

import java.math.BigDecimal;

public class Persona {
	private String genero;
	private BigDecimal altura;

	public Persona(String genero, BigDecimal altura) {
		this.genero = genero;
		this.altura = altura;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		this.genero = genero;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [genero=" + genero + ", altura=" + altura + "]";
	}

}
