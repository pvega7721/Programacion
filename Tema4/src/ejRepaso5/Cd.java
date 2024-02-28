package ejRepaso5;

public class Cd extends Publicacion{
	Boolean prestado;

	public Cd(Integer codigo, String autor, String titulo, Integer anoPublicacion, Boolean prestado) {
		super(codigo, autor, titulo, anoPublicacion);
		this.prestado = false;
	}
	
}
