package ejercicio44;

public class Jugador {
	public String nombre;
	public EquipoCombate equipo;
	
	public String getNombre() {
		return nombre;
	}
	public String setNombre(String string) {
		return nombre;
	}
	public EquipoCombate getEquipo() {
		return equipo;
	}
	public void setEquipo(EquipoCombate equipo) {
		this.equipo= equipo;
	}
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", equipoCombate=" + equipo + "]";
	}
	
	
}
