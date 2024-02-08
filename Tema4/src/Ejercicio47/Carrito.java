package Ejercicio47;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	private LocalDate fechaCreacion;
	private LocalDate ultimaActualizacion;
	private Cliente cliente;
	private List<articulo> listaArticulos = new ArrayList<>();

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getUltimaActualizacion() {
		return ultimaActualizacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<articulo> getListaArticulos() {
		return listaArticulos;
	}
	

	public Carrito(Cliente cliente) {
		this.cliente = cliente;
		this.fechaCreacion = LocalDate.now();
		this.ultimaActualizacion = LocalDate.now();
	}

}
