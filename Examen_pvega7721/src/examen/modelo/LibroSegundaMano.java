package examen.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LibroSegundaMano extends Libro {
	private Integer antiguedad;

	public LibroSegundaMano(Integer antiguedad) {
		super();
		this.antiguedad = antiguedad;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public BigDecimal getPrecio() {
		return getPrecio().divide(new BigDecimal(2), 2, RoundingMode.HALF_DOWN);
	}

}
