package ejRepaso5;

public class Libro extends Publicacion{
	Boolean prestado;
	Boolean consultando;
	
	public Libro(Integer codigo, String autor, String titulo, Integer anoPublicacion, Boolean prestado,
			Boolean consultando) {
		super(codigo, autor, titulo, anoPublicacion);
		this.prestado = false;
		this.consultando = false;
	}
	
}
