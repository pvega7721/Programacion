package ejRepaso4;

public class LibroFisico extends Libro{
	private Integer ancho;
	private Integer alto;

	public LibroFisico() {
		
	}
	
	public Integer getAncho() {
		return ancho;
	}
	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}
	public Integer getAlto() {
		return alto;
	}
	public void setAlto(Integer alto) {
		this.alto = alto;
	}
	public Integer getTamaño() {
		return alto*ancho;
	}
	
	
}
