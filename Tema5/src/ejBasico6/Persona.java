package Tema5.src.ejBasico6;

import java.math.BigDecimal;

public class Persona {
	private String genero;
	private BigDecimal altura;

	public Persona(String genero, BigDecimal altura) {
		this.genero = genero;
		this.altura = altura;
	}

	public Persona() {

	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		try {
			if (genero.equalsIgnoreCase("h") || genero.equalsIgnoreCase("m")) {
				this.genero = genero;
			} else {
				throw new ParametroIncorrectoException("Género incorrecto");
			}
		} catch (ParametroIncorrectoException e) {
			System.out.println(e.getMessage());
		}
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		try {
			if (altura.compareTo(BigDecimal.ZERO) <= 0 || altura.compareTo(new BigDecimal(3)) >= 0) {
				throw new ParametroIncorrectoException("Altura incorrecta");
			} else {
				this.altura = altura;
			}
		} catch (ParametroIncorrectoException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public String toString() {
		return "Persona [genero=" + genero + ", altura=" + altura + "]";
	}

}
