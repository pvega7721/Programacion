package examen.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Libreria {
	private String nombre;
	private Map<String, Libro> mapaLibros;

	public Libreria() {
		
	}
	public Libreria(String nombre, Map<String, Libro> mapaLibros) {
		super();
		this.nombre = nombre;
		this.mapaLibros = new HashMap<>();
	}

	public BigDecimal getTasacionCompleta() {
		BigDecimal sumaPrecio = BigDecimal.ZERO;
		mapaLibros = new HashMap<>();
		for (Libro libro : mapaLibros.values()) {
			sumaPrecio = sumaPrecio.add(libro.getPrecio());
		}

		return sumaPrecio.setScale(2, RoundingMode.HALF_DOWN);
	}

	public BigDecimal getPrecioMedio() {
		BigDecimal precioMedio = BigDecimal.ZERO;
		Map<String, Libro> mapaLibros = this.mapaLibros;

		for (int i = 0; i < mapaLibros.size(); i++) {
			precioMedio = this.getTasacionCompleta().divide(new BigDecimal(mapaLibros.size()));
		}
		return precioMedio;
	}

	public List<Libro> getLibrosBaratos() {
		List<Libro> listaLibros = new ArrayList<>();
		Map<String, Libro> mapaLibros = this.mapaLibros;
		Set<String> keys = mapaLibros.keySet();

		if (mapaLibros.isEmpty()) {
			System.out.println("No hay libros en la librería");
			return null;
		} else {
			for (String key : keys) {
				if (mapaLibros.get(key).getPrecio().compareTo(new BigDecimal(10)) < 0) {
					listaLibros.add(mapaLibros.get(key));
				}
			}
		}

		return listaLibros;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<String, Libro> getMapaLibros() {
		return mapaLibros;
	}

	public void setMapaLibros(Map<String, Libro> mapaLibros) {
		this.mapaLibros = mapaLibros;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libreria other = (Libreria) obj;
		return Objects.equals(nombre, other.nombre);
	}

}
