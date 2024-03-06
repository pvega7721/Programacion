package repasoExamen;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Asiento {
	protected Integer fila;
	protected String asiento;
	protected String ubicacion;
	protected Boolean estaOcupado;
	protected static BigDecimal precioBase;

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Boolean getEstaOcupado() {
		return estaOcupado;
	}

	public void setEstaOcupado(Boolean estaOcupado) {
		this.estaOcupado = estaOcupado;
	}

	public BigDecimal getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(BigDecimal precioBase) {
		Asiento.precioBase = precioBase;
	}

	public Integer getFila() {
		return fila;
	}

	public void setFila(Integer fila) {
		this.fila = fila;
	}

	public Asiento(Integer fila, String asiento) {
		this.fila = fila;
		this.asiento = asiento;
		this.ubicacion = "Fila: " + fila + "Asiento: " + asiento;
		this.estaOcupado = false;
	}

	public Asiento() {

	}

	public BigDecimal getPrecioVenta() {
		BigDecimal precioVenta = precioBase.setScale(2, RoundingMode.HALF_UP);
		return precioVenta;
	}

	@Override
	public String toString() {
		if (estaOcupado == false) {
			return "FILA/ASIENTO: " + fila + "/" + asiento + " PVP: " + getPrecioVenta() + " €" + "LIBRE" + "]";
		} else {
			return "FILA/ASIENTO: " + fila + "/" + asiento + " PVP: " + getPrecioVenta() + " €" + "Ocupado" + "]";
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(asiento, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asiento other = (Asiento) obj;
		return Objects.equals(asiento, other.asiento) && Objects.equals(fila, other.fila);
	}

}
