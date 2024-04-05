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
		BigDecimal division = BigDecimal.ZERO;
		for (int i = 1; i < listaNumeros.size(); i++) {
			BigDecimal posicion = new BigDecimal(listaNumeros.get(0));
			BigDecimal iterador = new BigDecimal(listaNumeros.get(i));
			division = posicion.divide(iterador, 2, RoundingMode.HALF_UP);
		}
		return division;
	}

	@Override
	public String toString() {
		return "Números: " + listaNumeros;
	}

}
