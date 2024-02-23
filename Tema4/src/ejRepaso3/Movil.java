package ejRepaso3;

import java.math.BigDecimal;

public class Movil extends Telefono{
	private LocalizadorGPS  posgps;
	
	public Movil(Integer numero, LocalizadorGPS posgps) {
		this.numero = numero;
		this.posgps = posgps;
		this.enLlamada=false;
	}

	public BigDecimal getPosgps() {
		return posgps;
	}

	public void setPosgps(BigDecimal posgps) {
		this.posgps = posgps;
	}
	
}
