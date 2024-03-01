package repasoExamen;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Avion {
	private String compañia;
	private LocalDate fechaFabricacion;
	private List<Asiento> listaAsientos;
	
	public Avion(String compañia, LocalDate fechaFabricacion) {
		super();
		this.compañia = compañia;
		this.fechaFabricacion= LocalDate.of(1, 1, 2000);
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(LocalDate fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public List<Asiento> getListaAsientos() {
		return listaAsientos;
	}

	public void setListaAsientos(List<Asiento> listaAsientos) {
		this.listaAsientos = listaAsientos;
	}
	
	public Integer getAntiguedad() {
		Period periodo = fechaFabricacion.until(LocalDate.now());
		Integer añosAvion = periodo.getYears();
		return añosAvion;
	}
	/*
	public void añadirAsiento() {
		
	}
	*/
	/*
	public List<Asiento> getCantidadAsientos() {
		
	}
	*/
	/*
	public List<Asiento> getListaAsientosLibres() {
		
	}
	*/
	public void establecerPrecioBase(BigDecimal Precio) {
		Asiento.precioBase= Precio;
	}
	public BigDecimal precioMedioVenta() {
		for (Asiento asiento : listaAsientos) {
			
		}
	}
}

