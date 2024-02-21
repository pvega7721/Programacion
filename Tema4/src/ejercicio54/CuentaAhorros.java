package ejercicio54;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
			}else {
				saldoTotal = saldoTotal.subtract(movimiento.getImporte());
			}
		}
		return saldoTotal.setScale(2, RoundingMode.HALF_DOWN);
		
	}
	
	public List<String> getMovimientos(){
		List<String> resultado = new ArrayList<>();
		for (Movimiento movimiento : movimientos) {
			resultado.add(movimiento.toString());
		}
		return resultado;
	}
	
	public List<String> getIngresos(){
		List<String> resultado = new ArrayList<>();
		for(Movimiento movimiento : movimientos) {
			if (movimiento.getTipo().equals(movimiento.INGRESO)) {
					resultado.add(movimiento.toString());
			}
		}
		return resultado;
	}
	
	
	public List<String> getCargos(){
		List<String> resultado = new ArrayList<>();
		for(Movimiento movimiento : movimientos) {
			if (movimiento.getTipo().equals(movimiento.CARGO)) {
					resultado.add(movimiento.toString());
			}
		}
		return resultado;
	}

}
