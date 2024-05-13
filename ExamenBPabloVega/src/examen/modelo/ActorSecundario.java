package examen.modelo;

import java.math.BigDecimal;

public class ActorSecundario extends Actor {

	public ActorSecundario(String nombreArtistico, BigDecimal cache) {
		super(nombreArtistico, cache);
		// TODO Auto-generated constructor stub
	}

	public Integer dedicacion;

	public Integer getDedicacion() {
		return dedicacion;
	}

	public void setDedicacion(Integer dedicacion) {
		this.dedicacion = dedicacion;
	}

	@Override
	public BigDecimal getCoste() {
		BigDecimal dediacion1 = new BigDecimal(dedicacion);
		return cache.multiply(dediacion1.divide(BigDecimal.TEN));
	}

}
