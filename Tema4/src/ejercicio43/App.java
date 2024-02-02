package ejercicio43;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos los actores
		Actor actor1 = new Actor();
		
		Actor actor2 = new Actor();
		
		Actor actor3 = new Actor();
		
		Actor actor4 = new Actor();
		
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
		
		//Creamos pelicula
		Pelicula pelicula1 = new Pelicula();
		//le damos valor a sus atributos
		pelicula1.setAnoEstreno(2027);
		pelicula1.setTitulo("Do you know Joe Blas");
		pelicula1.setDirector(director);
		pelicula1.setGuionista(guionista1);
		pelicula1.setActor().add(actor1);
		pelicula1.setActor(actor2);
		
		//Creamos otra pelicula
		Pelicula pelicula2 = new Pelicula();
		//le damos valor a sus atributos
		pelicula2.setAnoEstreno(2027);
		pelicula2.setTitulo("Muerte en la sombra");
		pelicula2.setDirector(director);
		pelicula2.setGuionista(guionista2);
		pelicula2.setActor(actor1);
		pelicula2.setActor(actor2);
		pelicula2.setActor(actor3);
		pelicula2.setActor(actor4);
		
	}

}

