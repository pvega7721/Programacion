package examen.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ActorPrincipal extends Actor {

	public ActorPrincipal(String nombreArtistico, BigDecimal cache) {
		super(nombreArtistico, cache);
		// TODO Auto-generated constructor stub
	}

	public String peliculaDebut;

	public String getPeliculaDebut() {
		return peliculaDebut;
	}

	public void setPeliculaDebut(String peliculaDebut) {
		this.peliculaDebut = peliculaDebut;
	}

	@Override
	public BigDecimal getCoste() {
		return cache.setScale(2, RoundingMode.HALF_DOWN);

	}
}
