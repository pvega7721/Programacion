package ejercicio12.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private Integer numero;
	private String cliente;
	private LocalDate fecha_entrega;
	private List<PedidoLinea> lineas;
	
	public Pedido() {
		
	};
	
	public Pedido(List<PedidoLinea> lineas) {
		this.lineas = new ArrayList<>();
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public LocalDate getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(LocalDate fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public List<PedidoLinea> getListaPedidos() {
		return lineas;
	}

	public void setListaPedidos(List<PedidoLinea> listaPedidos) {
		this.lineas = listaPedidos;
	}

	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", cliente=" + cliente + ", fecha_entrega=" + fecha_entrega
				+ ", listaPedidos=" + lineas + "]";
	}

}
