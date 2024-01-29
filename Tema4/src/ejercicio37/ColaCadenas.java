package ejercicio37;

import java.util.ArrayList;
import java.util.List;

public class ColaCadenas {
	
	List<String> colaEspera = new ArrayList<>();

	//Métdo que recibe una cadena y la mete en la cola
	public void añadirCadena(String cadena) {
		colaEspera.add(cadena);
	}
	//Método que devuelve la primera posición de la cola
	public String sacarCadena() {
		return colaEspera.get(0);
	}
	//
	public Integer getTamaño() {
		return colaEspera.size();
	}
	@Override
	public String toString() {
		return "ColaCadenas [colaEspera=" + colaEspera + ", sacarCadena()=" + sacarCadena() + ", getTamaño()="
				+ getTamaño() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
