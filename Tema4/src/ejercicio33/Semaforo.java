package ejercicio33;

public class Semaforo {
	
	public static final String ROJO = "ROJO";
	public static final String VERDE = "VERDE";
	public static final String AMBAR = "AMBAR";
	
	//Tendrá dos atributos; color, de tipo String y parpadeando, de tipo Boolean
	private String color;
	private Boolean parpadeando;
	//Constructor por defecto inicializado en Rojo y sin parpadear
	public Semaforo() {
		this.color=ROJO;
		this.parpadeando=false;
	}
	//Creamos metodos get y set
	public String getColor() {
		return color;
	}
	//Validamos que sólo cambiará de color si se indica Rojo, Verde o Ambar.
	public void setColor(String color) {
		if(color.equals(ROJO) || color.equals(VERDE) || color.equals(AMBAR)) {
			this.color = color;
		}
	}

	public Boolean getParpadeando() {
		return parpadeando;
	}
	//Validamos que el estado de parpadeo sólo puede cabiar si el color es Ambar.
	public void setParpadeando(Boolean parpadeando) {
		if(parpadeando && !color.equals(AMBAR)) {
			return;
		}
		this.parpadeando = parpadeando;
	}

	@Override
	public String toString() {
		
		if(color.equals(AMBAR) && parpadeando) {
			return "Semáforo en " + AMBAR + " parpadeando";
		}
		return "Semáforo en " + color;
	}
		
	//Método que cambia el estado del semáforo según el ciclo (verde-ambar parpadeando-ambar sin parpadear-rojo)
	public void cambiarEstado() {
		if(color.equals(VERDE)) {
			color = AMBAR;
			parpadeando = true;
		}
		else if(color.equals(AMBAR) && parpadeando) {
			parpadeando = false;
		}
		else if(color.equals(AMBAR)) {
			color = ROJO;
		}
		else {
			color=VERDE;
		}
	}
	
}
