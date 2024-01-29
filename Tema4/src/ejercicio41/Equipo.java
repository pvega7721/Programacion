package ejercicio41;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {
	
	private String nombre;
	private Jugador capitan;
	private List<Jugador> listaJugadores = new ArrayList<>();
	
	public Equipo (String nombre) {
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(capitan, listaJugadores, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return nombre + " - Capitán:" + capitan + " - Jugadores:" + listaJugadores + "]";
	}
	
	
}
