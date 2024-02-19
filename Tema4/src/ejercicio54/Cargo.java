package ejercicio54;


public abstract class Cargo extends Movimiento{
	private String cif;

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}
	
//falta tostring
	
	@Override
	public String getTipo() {
		return CARGO;
	}
}
