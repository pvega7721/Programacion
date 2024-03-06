package repasoExamen;

import java.math.BigDecimal;

public class AsientoPrimera extends Asiento {
	BigDecimal precioVenta = BigDecimal.ZERO;

	public AsientoPrimera(Integer fila, String asiento) {
		this.fila = fila;
		this.asiento = asiento;
	}

	public void setPrecioVenta(BigDecimal precioBase) {
		this.precioVenta = Asiento.precioBase.multiply(new BigDecimal(0.2));
	}
}
