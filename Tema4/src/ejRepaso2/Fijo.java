package ejRepaso2;

public class Fijo extends Telefono{
	private String direccion;
	
	public Fijo(Integer numero, String direccion) {
		this.numero = numero;
		this.direccion = direccion;
		this.enLlamada=false;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
