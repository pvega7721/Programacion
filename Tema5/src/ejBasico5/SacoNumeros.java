package ejBasico5;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
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
		
		for(int i=1; i<listaNumeros.size(); i++) {
			listaNumeros.get(0).divide(listaNumeros.get(i),2,RoundingMode.HALF_UP);
		}
	}

	@Override
	public String toString() {
		return "Números: " + listaNumeros;
	}

}
