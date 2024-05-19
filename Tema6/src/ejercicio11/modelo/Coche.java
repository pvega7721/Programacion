package ejercicio11.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Coche {
	private String matricula;
	private String marca;
	private BigDecimal precio;
	private LocalDateTime fechaHoraCompra;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public LocalDateTime getFechaHoraCompra() {
		return fechaHoraCompra;
	}
	public void setFechaHoraCompra(LocalDateTime fechaHoraCompra) {
		this.fechaHoraCompra = fechaHoraCompra;
	}
	@Override
	public String toString() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", precio=" + precio + ", fechaHoraCompra="
				+ format.format(fechaHoraCompra) + "]\n";
	}
	
}
