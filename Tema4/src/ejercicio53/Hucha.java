package ejercicio53;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Hucha {
	//Se inicia a 0 redondeando 2 decimales
	private BigDecimal ahorro = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_DOWN);
	
	//Método que recibe el importe y lo añade a la hucha
	public BigDecimal meterDinero(BigDecimal introducir) {
		return ahorro.add(introducir);
	}
	
	//Método que recibe el importe a sacar y devuelve el importe sacado, no hay suficiente, devuelve lo que haya.
	public BigDecimal sacarDinero(BigDecimal sacar) {
		if(ahorro.compareTo(sacar) == -1) {
			return ahorro;
		}
		return ahorro.subtract(sacar);
	}
	
	//Método que devuelve lo que hay en la hucha.
	public BigDecimal contarDinero() {
		return ahorro;
	}
	
	public BigDecimal romperHucha() {
		BigDecimal ahorro_ahora=ahorro;
		ahorro = ahorro.subtract(ahorro);
		return ahorro_ahora;
	}
	
}
