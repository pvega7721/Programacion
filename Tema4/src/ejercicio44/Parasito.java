package ejercicio44;

public class Parasito extends Personaje{
	public Integer dañoSeg = 2;

	public Parasito() {
		puntosVida=200;
	}
	public Integer getDañoSeg() {
		return dañoSeg;
	}

	public void setDañoSeg(Integer dañoSeg) {
		this.dañoSeg = dañoSeg;
	}

	@Override
	public String toString() {
		return "Parasito [dañoSeg=" + dañoSeg + "]";
	}
	
	
}
