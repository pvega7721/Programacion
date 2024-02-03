package ejercicio44;

public class Jugador {
	public String nombre;
	public String equipoCombate;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEquipoCombate() {
		return equipoCombate;
	}
	public void setEquipoCombate(String equipoCombate) {
		this.equipoCombate = equipoCombate;
	}
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", equipoCombate=" + equipoCombate + "]";
	}
	
	
}
