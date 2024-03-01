package ejRepaso3;


public class Movil extends Telefono{
	private LocalizadorGPS  posgps;
	
	
	public Movil(Integer numero, LocalizadorGPS posgps) {
		super(numero);
		this.posgps = posgps;
	}


	public LocalizadorGPS getPosgps() {
		return posgps;
	}

	public void setPosgps(LocalizadorGPS posgps) {
		this.posgps = posgps;
	}
	
}
