package ejercicio44;

public abstract class Asesino extends Personaje{
	
	
	private static final Integer PUNTOS_VIDA = 100;
	private static final Integer DAÑO = 10;
	private static final Integer DAÑO_TIEMPO = 5;
	
	
	public Integer getPuntosVida() {
		return PUNTOS_VIDA;
	}
	public Integer getDaño() {
		return DAÑO;
	}
	public Integer getDañoTiempo() {
		return DAÑO_TIEMPO;
	}
	
	
	@Override
	public String toString() {
		return "Asesino []";
	}

	
	
	
	
}
