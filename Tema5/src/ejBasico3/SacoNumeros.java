package ejBasico3;

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
		System.out.println(listaNumeros.get(posicion));
	}

	@Override
	public String toString() {
		return "Números: " + listaNumeros;
	}

}
