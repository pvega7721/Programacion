package ejRepaso4;

import java.util.ArrayList;
import java.util.List;

public class Libreria {
	private List<Libro> libros;
	private String direccion;
	private Integer numTelefono;

	public Libreria() {
		libros = new ArrayList<>();
	}
	
	public void añadirLibroFisico(LibroFisico libro) {
		libros.add(libro);
	}
	public void añadirLibroDigital(LibroDigital libro) {
		libros.add(libro);
	}
	
	public Libro obtenerLibroMasAntiguo() {
		Libro masAntiguo=libros.get(0);
		if (this.libros.isEmpty()) {
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
			peso += libro.getPeso();
		}
		String pesoTotal = "Peso total = " + peso + "gramos";
		return pesoTotal;
	}
	
	public String obtenerNumPaginasMedio() {
		Integer totalPaginas = 0;
		for (Libro libro : libros) {
			totalPaginas += libro.getNumPaginas();
		}
		
		String mediaPaginas = "Cada libro tiene de media: " + totalPaginas / libros.size() + " páginas";
		return mediaPaginas;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(Integer numTelefono) {
		this.numTelefono = numTelefono;
	}
	
}
