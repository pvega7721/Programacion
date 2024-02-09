package Ejercicio47;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	private LocalDate fechaCreacion;
	private LocalDate ultimaActualizacion;
	private Cliente cliente;
	private List<Articulo> listaArticulos;

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
	

	public Carrito(Cliente cliente) {
		this.cliente = cliente;
		this.fechaCreacion = LocalDate.now();
		this.ultimaActualizacion = LocalDate.now();
		listaArticulos = new ArrayList<>();
	}
	public Integer getCantidad() {
		return listaArticulos.size();
	}
	Double suma=0.0;
	public String getTotal() {
		
		for(int i =0; i<listaArticulos.size();i++) {
			//Preguntar a Belén
			suma += listaArticulos.get(i);
		}
		return "El total a pagar es: " + suma;
	}
	public String getPrecioMedio() {
		Double precioMedio=0.0;
		Double preciomedio=suma/listaArticulos.size();
		return "El precio medio es: " + precioMedio;
	}
	public void addArticulo(ArrayList<Articulo> lista, Articulo Articulo) {
			//Preguntar a belén
	}
	public void borrarArticulo() {
			//Preguntar a Belén
	}
	public void vaciarCesta() {
		listaArticulos.clear();
	}

	@Override
	public String toString() {
		return "Carrito [cliente=" + cliente + ", listaArticulos=" + listaArticulos + ", getUltimaActualizacion()="
				+ getUltimaActualizacion() + ", getTotal()=" + getTotal() + "]";
	}
	

}
