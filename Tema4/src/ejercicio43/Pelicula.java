package ejercicio43;

import java.util.List;

public class Pelicula {
	private Integer anoEstreno;
	private String titulo;
	private Director director;
	private Guionista guionista;
	private List<Actor> actor;
	
	
	public Integer getAnoEstreno() {
		return anoEstreno;
	}
	public void setAnoEstreno(Integer anoEstreno) {
		this.anoEstreno = anoEstreno;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public Guionista getGuionista() {
		return guionista;
	}
	public void setGuionista(Guionista guionista) {
		this.guionista = guionista;
	}
	public List<Actor> getActor() {
		return actor;
	}
	public void setActor(List<Actor> actor) {
		this.actor = actor;
	}
	
	
	
}
