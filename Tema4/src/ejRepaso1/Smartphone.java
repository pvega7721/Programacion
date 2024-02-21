package ejRepaso1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Smartphone {
	private String marca;
	private String modelo;
	private String imei;
	private BigDecimal precio;
	private LocalDate fechaFabricacion;
	private Boolean activo;

	public Smartphone(){
		this.precio = BigDecimal.ZERO;
		this.activo = true;
	}
	
	public Smartphone(String imei) {
		this.imei = imei;
		this.precio = BigDecimal.ZERO;
		this.activo = true;
	}

	public Smartphone(String marca, String modelo, String imei) {
		this.marca = marca;
		this.modelo = modelo;
		this.imei = imei;
		this.precio = BigDecimal.ZERO;
		this.activo = true;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	public void activar() {
		this.activo = true;
	}
	public void desactivar() {
		this.activo = false;
	}
	public Integer getEdad(LocalDate fechaFabricacion) {
		LocalDate fecha = LocalDate.of(2000, Month.APRIL, 1);
		Period periodo;
		if(fechaFabricacion != null) {
			periodo = fecha.until(fechaFabricacion);
		}else {
			return null;
		}
		
		return periodo.getYears();
	}
	public void cambiarMarcaModelo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void establecerFabricacion( LocalDate fabricacion) {
		fechaFabricacion = fabricacion;
	}
	public BigDecimal getPrecioMasIva() {
		return this.precio.add(this.precio.multiply(new BigDecimal(0.21)));
	}
	public Boolean isAltaGama(BigDecimal precioBase) {
		if(this.precio.compareTo(precioBase)>0) {
			return true;
		}
		return false;
	}
	public Boolean isDatosCompletos() {
		if(this.imei == null || this.imei.isBlank() || this.precio == null) {
			return false;
		}
		return true;
	
	}
	public Boolean isGratis() {
		if(this.precio.equals(BigDecimal.ZERO)) {
			return true;
		}
		return false;
	}
	public void rebajar() {
		if(this.precio.compareTo(BigDecimal.TEN) >=0) {
			this.precio = this.precio.subtract(BigDecimal.TEN);
		}
	}

	@Override
	public String toString() {
		String resultado = this.marca + "(" + this.modelo + ")";
		if(!this.activo) {
			return resultado + " - INACTIVO";
		}
		return resultado;
	}
	
	
}
