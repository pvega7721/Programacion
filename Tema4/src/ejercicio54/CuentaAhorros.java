package ejercicio54;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CuentaAhorros {
	private String numCuenta;
	private List<Movimiento> movimientos;
	
	
	public CuentaAhorros(String numCuenta) {
		this.numCuenta = numCuenta;
		movimientos = new ArrayList<>();
	}
	
	public void añadirMovimiento(Movimiento movimiento) {
		movimientos.add(movimiento);
	}
	
	public BigDecimal obtenerTotal() {
		
		return
	}

}
