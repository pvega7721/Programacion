package caballo_practica;
//7. crear clase pública Caballo
public class Caballo {
	//8. Crear atributos
	public String nombre;
	public String color;
	public int edad;
	public int carrerasGanadas;
	
	public Caballo() {
		
	}
	//Constructor
	public Caballo(String nombre, String color, int edad, int carrerasGanadas) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.edad = edad;
		this.carrerasGanadas = carrerasGanadas;
	}
	// Para el apartado 9, creamos getters an setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCarrerasGanadas() {
		return carrerasGanadas;
	}
	public void setCarrerasGanadas(int carrerasGanadas) {
		this.carrerasGanadas = carrerasGanadas;
	}
	
	
}
