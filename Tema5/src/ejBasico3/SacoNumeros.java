package ejBasico3;

import java.util.List;

public class SacoNumeros {
	private List<Integer> listaNumeros;

	// Constructor inicializando la lista
	public SacoNumeros(List<Integer> listaNumeros) {
		this.listaNumeros = listaNumeros;
	}

	// Método que añade un numero a la lista
	public void addNumero(Integer numero) {
		listaNumeros.add(numero);
	}

	// Método que recibe un número (Que será la posición deseada) y devuelve el
	// número que esté en dicha posición
	public Integer getListaNumeros(Integer numero) {
		return listaNumeros.get(numero);
	}

	@Override
	public String toString() {
		return "SacoNumeros [listaNumeros=" + listaNumeros + "]";
	}

}
