package ejercicio33;

public class Semaforo {
	
	public static final String ROJO = "ROJO";
	public static final String VERDE = "VERDE";
	public static final String AMBAR = "AMBAR";
	
	private String color;
	private Boolean parpadeando;
	
	public Semaforo() {
		this.color=ROJO;
		this.parpadeando=false;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(color.equals(ROJO) || color.equals(VERDE) || color.equals(AMBAR)) {
			this.color = color;
		}
	}

	public Boolean getParpadeando() {
		return parpadeando;
	}

	public void setParpadeando(Boolean parpadeando) {
		this.parpadeando = parpadeando;
	}
	
}
