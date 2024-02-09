package Ejercicio47;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	private LocalDate fechaCreacion;
	private LocalDate ultimaActualizacion;
	private Cliente cliente;
	private List<Articulo> listaArticulos;

	public Carrito(Cliente cliente) {
		this.cliente = cliente;
		this.fechaCreacion = LocalDate.now();
		this.ultimaActualizacion = LocalDate.now();
		//La lista se crea en el constructor
		listaArticulos = new ArrayList<>();
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

	public List<Articulo> getListaArticulos() {
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
		listaArticulos.add(articulo);
		ultimaActualizacion = LocalDate.now();
	}
	public void borrarArticulo(int posicion) {
		
		if(posicion >= 0 && posicion<this.listaArticulos.size())
		listaArticulos.remove(posicion);
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
