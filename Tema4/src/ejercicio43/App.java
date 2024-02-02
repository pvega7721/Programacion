package ejercicio43;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos los actores
		Actores BlasBlau = new Actores();
		Actores LauraPozo = new Actores();
		Actores MarcelCade = new Actores();
		Actores VioletaVolo = new Actores();
		
		//Les damos fecha de nacimiento
		BlasBlau.setAnoNacimiento(1983);
		LauraPozo.setAnoNacimiento(1981);
		MarcelCade.setAnoNacimiento(2001);
		VioletaVolo.setAnoNacimiento(1999);
		
		//Les damos lugar de nacimiento
		BlasBlau.setNacionalidad("España");
		LauraPozo.setNacionalidad("Italia");
		MarcelCade.setNacionalidad("Suiza");
		VioletaVolo.setNacionalidad("Rusia");
		
	}

}
