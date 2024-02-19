package ejercicio54;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Movimiento {
	protected static final String CARGO = "C";
	protected static final String RETIRADA = "R";
	protected static final String INGRESO = "I";
	protected LocalDate fecha;
	protected BigDecimal importe;


	public Movimiento(){
		fecha = LocalDate.now();
		importe = BigDecimal.ZERO;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public BigDecimal getImporte() {
		return importe;
	}


	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}
	
	public abstract String getTipo(); //Método abstracto no tiene contenido, solo se declara.


	public String getIMPORTE() {
		return IMPORTE;
	}


	public String getCARGO() {
		return CARGO;
	}


	public String getRETIRADA() {
		return RETIRADA;
	}
	

}