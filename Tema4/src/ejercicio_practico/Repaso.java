package ejercicio_practico;

public class Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mensaje = "¿Hola cómo estas?";
		
		Boolean haceSol = true;
		
		Integer dias = 7;
		
		System.out.println(mensaje);
		
		Caballo caballo1 = new Caballo();
		
		/*
		System.out.println(caballo1.color);
		
		caballo1.color= "Marrón";
		
		System.out.println(caballo1.color);
		*/
		caballo1.imprimeCarrerasGanadas();
		
		int anyo = caballo1.anyoNacimiento();
		System.out.println("El año de nacimiento del caballo es: " + anyo);
		
		caballo1.incrementarCarrerasGanadas();
		
		caballo1.imprimeCarrerasGanadas();
		
		caballo1.relincha();
		
		caballo1.setNombre("Bolita");
		System.out.println(caballo1.getNombre());
		
		caballo1.setColor("Marrón");
		System.out.println(caballo1.getColor());
		
		caballo1.setEdad(2);
		System.out.println(caballo1.getEdad());
		
		String datos = caballo1.toString();
		
		System.out.println(datos);
		
		Caballo caballo2 = new Caballo("Fideo", "Blanco", 4, 20);
		
		
	}

}
