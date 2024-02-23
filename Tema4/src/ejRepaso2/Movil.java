package ejRepaso2;

public class Movil extends Telefono{
	private String posgps;
	
	public Movil(Integer numero, String posgps) {
		this.numero = numero;
		this.posgps = posgps;
		this.enLlamada=false;
	}

	public String getPosgps() {
		return posgps;
	}

	public void setPosgps(String posgps) {
		this.posgps = posgps;
	}
	
}
