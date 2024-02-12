package ejercicio48;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Carrito {
	private LocalDate fechaCreacion;
	private LocalDate ultimaActualizacion;
	private Cliente cliente;
	private Set<Articulo> listaArticulos;

	public Carrito(Cliente cliente) {
		this.cliente = cliente;
		this.fechaCreacion = LocalDate.now();
		this.ultimaActualizacion = LocalDate.now();
		//La lista se crea en el constructor
		listaArticulos = new HashSet<>();
	}
	
	
	public Double getTotal() {
		Double suma=0.0;
		for(Articulo articulo: listaArticulos) {
			
			suma = suma + articulo.getPrecio();
		}
		return suma;
	}
	
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getUltimaActualizacion() {
		return ultimaActualizacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Set<Articulo> getListaArticulos() {
		return listaArticulos;
	}
	
	public Integer getCantidad() {
		return listaArticulos.size();
	}
	
	public Double getPrecioMedio() {
		if(getCantidad() == 0) {
			return 0.00;
		}
		return getTotal() / getCantidad();
	}
	public void addArticulo(Articulo articulo) {
		if(listaArticulos.add(articulo)) {
		ultimaActualizacion = LocalDate.now();
		}
	}
	public void borrarArticulo(Articulo articulo) {
		listaArticulos.remove(articulo);
		ultimaActualizacion = LocalDate.now();
	}
	public void vaciarCesta() {
		listaArticulos.clear();
	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Cliente=" + cliente.getDni() + ", " + cliente.getNombre() + ""
				+ "Articulos=" + getCantidad() + getTotal() 
				+", Ultima Actualizacion=" + getUltimaActualizacion();
	}
	

}
