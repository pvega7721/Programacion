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
			System.out.println("Introduce el género");
			if (!genero.equalsIgnoreCase("h") || !genero.equalsIgnoreCase("m")) {
				throw new ParametroIncorrectoException("Género incorrecto");
			} else {
				this.genero = genero;
			}
		} catch (ParametroIncorrectoException e) {
			System.out.println(e.getMessage());
		}
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
