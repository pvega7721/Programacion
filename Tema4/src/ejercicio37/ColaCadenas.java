package ejercicio37;

import java.util.ArrayList;
import java.util.List;

public class ColaCadenas {
	//atributo de la clase
	 private List<String> colaEspera;
	
	//la lista se crea en el constructor
	public ColaCadenas() {
		colaEspera=new ArrayList<>();
	}

	public void añadirCadena(String cadena) {
		colaEspera.add(cadena);
	}
	
	public String sacarCadena() {
		if(colaEspera.isEmpty()) {
		return null;
		}
		return colaEspera.remove(0);
	}
	
	public Integer getTamaño() {
		return colaEspera.size();
	}
	@Override
	public String toString() {
		return colaEspera.toString();
	}
	
	
}
