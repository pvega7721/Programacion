package ejercicio53;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Hucha {
	//Se inicia a 0 redondeando 2 decimales
	private BigDecimal ahorro = BigDecimal.ZERO.setScale(2, RoundingMode.FLOOR);
	
	//añado método get para poder acceder a el desde el App
	public BigDecimal getAhorro() {
		return ahorro;
	}

	//Método que recibe el importe y lo añade a la hucha
	public BigDecimal meterDinero(BigDecimal introducir) {
		//El método debe igualarse a la suma de ahorro + introducir.
		//añado setScale a la variable introducir para que de el formato deseado
		return ahorro = ahorro.add(introducir.setScale(2,RoundingMode.FLOOR));
	}
	
	//Método que recibe el importe a sacar y devuelve el importe sacado, no hay suficiente, devuelve lo que haya.
	public BigDecimal sacarDinero(BigDecimal sacar) {
		if(ahorro.compareTo(sacar) == -1) {
			BigDecimal ahorroActual = ahorro;
			ahorro = ahorro.subtract(ahorro);
			return ahorroActual;
		}else {
		//El método debe igualarse a la resta de ahorro + sacar.
		//Añado setScale a la variable sacar para que de el formato deseado.
		return ahorro = ahorro.subtract(sacar.setScale(2,RoundingMode.FLOOR));
		}
	}
	
	//Método que devuelve lo que hay en la hucha.
	public BigDecimal contarDinero() {
		return ahorro;
	}
	//Método romper hucha que saca todo el dinero que haya y devuevle lo que había
	public BigDecimal romperHucha() {
		BigDecimal ahorro_ahora=ahorro;
		ahorro = ahorro.subtract(ahorro);
		return ahorro_ahora;
	}

	//Imprimir importe actual de la hucha con un formato determinado
	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,###.00€");
		return "Hucha [ahorro= " + formato.format(ahorro) + "]";
	}
	
}
