package ejercicio54;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Movimiento {
	private LocalDate fecha;
	private BigDecimal importe;
	private final String CARGO = "C";
	private final String RETIRADA = "R";
	private final String IMPORTE = "I";


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
	
	public String getTIPO() {
		return TIPO;
	}


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