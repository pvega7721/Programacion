package ejercicio_caballo;

public class Caballo {

		private String nombre;
		private String color;
		private int edad;
		private int carrerasGanadas;
		
		
		public Caballo(String nombre, String color, int edad, int carrerasGanadas) {
			super();
			this.nombre = nombre;
			this.color = color;
			this.edad = edad;
			this.carrerasGanadas = carrerasGanadas;
		}
		
		public Caballo()
		{
			this.nombre = "";
			color = "";
			this.edad = 0;
			this.carrerasGanadas = 0;
		}
		
		public void imprimeCarrerasGanadas()
		{
			System.out.println("El número de carreras ganadas es: " + this.carrerasGanadas);
		}
		public int anyoNacimiento()
		{
			return (2024-edad);
		}
		
		public void incrementarCarrerasGanadas()
		{
			this.carrerasGanadas=carrerasGanadas +1;
		}
		
		public void relincha()
		{
			System.out.println("HIIIIII");
		}
		
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

		@Override
		public String toString() {
			return "Caballo [nombre=" + nombre + ", color=" + color + ", edad=" + edad + ", carrerasGanadas="
					+ carrerasGanadas + "]";
		}
		
		
}
