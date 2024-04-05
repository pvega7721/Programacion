package ejBasico5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class SacoNumeros {
	public List<Integer> listaNumeros = new ArrayList<>();

	// Método que añade un numero a la lista
	public void addNumero(Integer numero) {
		listaNumeros.add(numero);
	}

	// Método que recibe un número (Que será la posición deseada) y devuelve el
	// número que esté en dicha posición
	public void getNumero(Integer posicion) {
		System.out.println("En la posición " + posicion + " se encuentra: " + listaNumeros.get(posicion));
	}

	public BigDecimal division() {
		try {
			BigDecimal resultado = new BigDecimal(this.listaNumeros.get(0));
			for (int i = 1; i < listaNumeros.size(); i++) {
				BigDecimal siguiente = new BigDecimal(listaNumeros.get(i));
				resultado = resultado.divide(siguiente, 2, RoundingMode.HALF_UP);
			}
			return resultado;
		} catch (ArithmeticException e) {
			return BigDecimal.ZERO;
		} catch (IndexOutOfBoundsException e) {
			return BigDecimal.ZERO;
		}
	}

	@Override
	public String toString() {
		return "Números: " + listaNumeros;
	}

}
