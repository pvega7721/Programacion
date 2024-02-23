package ejRepaso3;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear telefonos fijo y movil con número y gps/direccion
		Movil telefono1 = new Movil(654654654, "posgps1");
		Fijo telefono2 = new Fijo(954954954, "Dirección1");
		
		//Imprimir número de cada uno
		System.out.println(telefono1.consultarNumero());
		System.out.println(telefono2.consultarNumero());
		
		//LLamar a su mismo número (Está mal)
		telefono1.marcar(654654654);
		//LLamar a otro número.
		telefono1.marcar(610610610);
		//Colgar con el movil
		telefono1.colgar();
		//Volver a colgar
		telefono1.colgar();
		
		
	}

}
