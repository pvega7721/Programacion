package ejercicio43;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos los actores
		Actores actor1 = new Actores();
		Actores actor2 = new Actores();
		Actores actor3 = new Actores();
		Actores actor4 = new Actores();
		
		//Les damos fecha de nacimiento
		actor1.setAnoNacimiento(1983);
		actor2.setAnoNacimiento(1981);
		actor3.setAnoNacimiento(2001);
		actor4.setAnoNacimiento(1999);
		
		//Les damos nombre
		actor1.setNombre("Blas Blau");
		actor2.setNombre("Laura Pozo");
		actor3.setNombre("Marcel Cade");
		actor4.setNombre("Violeta Volo");
		
		//Les damos lugar de nacimiento
		actor1.setNacionalidad("España");
		actor2.setNacionalidad("Italia");
		actor3.setNacionalidad("Suiza");
		actor4.setNacionalidad("Rusia");
		
		//Creamos directora
		Director director = new Director();
		//le damos valor a sus atributos
		director.setAnoNacimiento(1994);
		director.setNacionalidad("Portugal");
		director.setNombre("Sara Marea");
		
		//Creamos guionistas
		Guionista guionista1 = new Guionista();
		Guionista guionista2 = new Guionista();

		//Le damos valor a sus atributos
		guionista1.setAnoNacimiento(1988);
		guionista2.setAnoNacimiento(1977);
		guionista1.setNacionalidad("Reino Unido");
		guionista2.setNacionalidad("China");
		guionista1.setNombre("Marco Smith");
		guionista2.setNombre("Cheng Shu");
	}

}

