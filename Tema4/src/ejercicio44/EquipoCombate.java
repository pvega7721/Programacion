package ejercicio44;

import java.util.ArrayList;
import java.util.List;

public class EquipoCombate {
	
	private List<Personaje> tropa;
	private Integer totalPuntosVida;
	
	public EquipoCombate() {
		tropa=new ArrayList<>();
		totalPuntosVida = 0;
	}
	
	public void añadirPersonaje(Personaje personaje) {
		if(tropa.size()<5 && !tropa.contains(personaje)) {
			tropa.add(personaje);
			totalPuntosVida+= personaje.getPuntosVida();
		}
	}

	public List<Personaje> getTropa() {
		return tropa;
	}

	public void setTropa(List<Personaje> tropa) {
		this.tropa = tropa;
	}

	public Integer getTotalPuntosVida() {
		return totalPuntosVida;
	}

	public void setTotalPuntosVida(Integer totalPuntosVida) {
		this.totalPuntosVida = totalPuntosVida;
	}
	
}
