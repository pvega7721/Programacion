package ejRepaso4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libreria {
	private List<Libro> libros;
	private String direccion;
	private Integer numTelefono;
	
	public Libreria() {
		libros = new ArrayList<>();
	}
	
	public Libro obtenerLibroMasAntiguo() {
		Libro masAntiguo=libros.get(0);
		if (libros.isEmpty()) {
			return null;
		}else { 
		
		for (Libro libro : libros) {
			if(libro.getFechaEdicion().isBefore(masAntiguo.getFechaEdicion())) {
				 masAntiguo=libro;
			}
		}
		return masAntiguo;
		
		}
	}
	
	public String obtenerPesoTotal() {
		Integer peso=0;
		for (Libro libro : libros) {
			peso = peso+libro.getPeso();
		}
		String pesoTotal = "Peso total = " + peso + "gramos";
		return pesoTotal;
	}
	public String obtenerNumPaginasMedio() {
		
	}
}
