package ejercicio44;

public class Asesino extends Personaje{
	public Integer daño_5seg = 10;

	
	public Asesino() {
		puntosVida=100;
	}
	
	public Integer getDaño_5seg() {
		return daño_5seg;
	}

	public void setDaño_5seg(Integer daño_5seg) {
		this.daño_5seg = daño_5seg;
	}

	@Override
	public String toString() {
		return "Asesino [daño_5seg=" + daño_5seg + "]";
	}
	
	
}
