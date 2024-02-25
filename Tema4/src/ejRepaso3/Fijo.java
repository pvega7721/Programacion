package ejRepaso3;

public class Fijo extends Telefono{
	private String direccion;

	public Fijo(Integer numero, Boolean enLlamada, String direccion) {
		super(numero, enLlamada);
		this.direccion = direccion;
	}


	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
