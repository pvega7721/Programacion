package repasoExamen;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Avion {
	private String compañia;
	private LocalDate fechaFabricacion;
	private List<Asiento> listaAsientos;

	public Avion(String compañia, LocalDate fechaFabricacion) {
		super();
		this.compañia = compañia;
		this.fechaFabricacion = LocalDate.of(1, 1, 2000);
	}

	public Avion(String compañia) {
		this.compañia = compañia;
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

	public void añadirAsiento(Asiento asiento) {
		listaAsientos.add(asiento);
	}

	// Devuelve cantidad de asientos que no están libres
	public Integer getCantidadAsientos() {
		Integer asientoLibre = 0;
		for (Asiento asiento : listaAsientos) {
			if (!asiento.estaOcupado) {
				asientoLibre++;
			}
		}
		return asientoLibre;
	}

	// Devuelve una lista con los todos los asientos libres
	public List<Asiento> getListaAsientosLibres() {
		List<Asiento> asientoLibre = new ArrayList<>();
		for (Asiento asiento : listaAsientos) {
			if (!asiento.estaOcupado) {
				asientoLibre.add(asiento);
			}
		}
		return asientoLibre;
	}

	public void establecerPrecioBaseAsiento(BigDecimal Precio) {
		Asiento.precioBase = Precio;
	}

	public BigDecimal precioMedioVenta() {
		BigDecimal suma = BigDecimal.ZERO;
		for (Asiento asiento : listaAsientos) {
			suma = suma.add(asiento.getPrecioVenta());
		}
		BigDecimal longitud = new BigDecimal(listaAsientos.size());
		BigDecimal precioMedio = suma.divide(longitud);
		return precioMedio.setScale(2, RoundingMode.HALF_DOWN);
	}

	// Métodod que comprueba que el asiento esté libre. Si lo está, compara su
	// precio con el asiento anterior. si es más barato, lo devuelve
	public Asiento getAsientoLibreMasBarato() {
		Asiento masBarato = listaAsientos.get(0);
		// comparar precio con el resto
		for (int i = 0; i < listaAsientos.size() - 1; i++) {
			// Comprueba que el asiento esté libre
			if (!listaAsientos.get(i).estaOcupado) {
				// se comparan todas las posiciones de la lista con la posición 0(masBarato), si
				// es más barato, se iguala a la posición.
				if (listaAsientos.get(i).getPrecioVenta().compareTo(masBarato.getPrecioVenta()) <= 0) {
					masBarato = listaAsientos.get(i);
				}
			}
		}
		return masBarato;
	}

	public void eliminarAsientosFila(Integer fila) {
		for (Asiento asiento : listaAsientos) {
			if (asiento.getFila() == fila) {
				listaAsientos.remove(asiento);
			}
		}
	}

	@Override
	public String toString() {
		return "Compañia:" + compañia + ". " + "Fabricacion: " + fechaFabricacion;
	}

}
