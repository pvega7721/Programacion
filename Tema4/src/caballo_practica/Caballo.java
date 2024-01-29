package caballo_practica;
//7. crear clase pública Caballo
public class Caballo {
	//8. Crear atributos
	//10. Cambiar los atributos a privado
	private String nombre;
	private String color;
	private Integer edad;
	private int carrerasGanadas;
	
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
	
	//12. Creo método imprimeCarrerasGanadas.
	/*13. Comentar el método anterior.
	 * public void imprimeCarrerasGanadas() {
		System.out.println("El número de carreras ganadas es: " + carrerasGanadas);
		} 
	*/
	
	//15. Crear un método público anyoNacimiento que devueve el año de nacimiento del caballo
	//16. Comentar el método anterior
		public Integer anyoNacimiento(){
			Integer anyoNacimiento = 2024 - edad;
			System.out.println(anyoNacimiento);
			return anyoNacimiento;
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
