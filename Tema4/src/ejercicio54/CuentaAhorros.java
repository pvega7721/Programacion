package ejercicio54;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CuentaAhorros {
	private String numCuenta; //String porque puede empezar en 0
	private List<Movimiento> movimientos;
	
	
	public CuentaAhorros(String numCuenta) {
		this.numCuenta = numCuenta;
		movimientos = new ArrayList<>();
	}
	
	public void añadirMovimiento(Movimiento movimiento) {
		movimientos.add(movimiento);
	}
	
	public BigDecimal obtenerTotal() {
		BigDecimal saldoTotal = BigDecimal.ZERO;
		
		for (Movimiento movimiento : movimientos) {
			if(movimiento.getTipo().equals("I")) {
				saldoTotal = saldoTotal.add(movimiento.getImporte());
			}
		}
		
	}

}
