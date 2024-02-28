package ejRepaso5;

public class Revista extends Publicacion{
	Boolean consultando;

	public Revista(Integer codigo, String autor, String titulo, Integer anoPublicacion, Boolean consultando) {
		super(codigo, autor, titulo, anoPublicacion);
		this.consultando = false;
	}
	
}
