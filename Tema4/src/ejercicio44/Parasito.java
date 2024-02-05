package ejercicio44;

public class Parasito extends Personaje{
	private static final Integer PUNTOS_VIDA = 200;
	private static final Integer DAÑO = 2;
	private static final Integer DAÑO_TIEMPO = 1;
	
	
	@Override
	public Integer getPuntosVida() {
		return PUNTOS_VIDA;
	}
	public  Integer getDaño() {
		return DAÑO;
	}
	public  Integer getDañoTiempo() {
		return DAÑO_TIEMPO;
	}

	@Override
	public String toString() {
		return "Parasito []";
	}
	
	
	
}
