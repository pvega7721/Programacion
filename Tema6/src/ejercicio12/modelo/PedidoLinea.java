package ejercicio12.modelo;

import java.math.BigDecimal;

public class PedidoLinea {

	private Integer numero_pedido;
	private String articulo;
	private Integer cantidad;
	private BigDecimal precio_unitario;

	public Integer getNumero_pedido() {
		return numero_pedido;
	}

	public void setNumero_pedido(Integer numero_pedido) {
		this.numero_pedido = numero_pedido;
	}

	public String getArticulo() {
		return articulo;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(BigDecimal precio_unitario) {
		this.precio_unitario = precio_unitario;
	}

	@Override
	public String toString() {
		return "PedidoLinea [numero_pedido=" + numero_pedido + ", articulo=" + articulo + ", cantidad=" + cantidad
				+ ", precio_unitario=" + precio_unitario + "]";
	}

}
