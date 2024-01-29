package caballo_practica;

public class Repaso {
// 	1-2. Crear clase repaso con metodo main
	public static void main(String[] args) {
		//3-4-5. Declarar variables
		String mensaje = "Hola, ¿Cómo estás?";
		Boolean haceSol = true;
		Integer dias = 7;
	// 	6. Imprimir mensaje
		System.out.println(mensaje);
	//	9. Crear variable caballo1 que sea un objeto de tipo Caballo
		Caballo caballo1 = new Caballo();
	//	9.Syso del color
	
	/* 	11. Comentar lo que falla del apartado 9
		System.out.println(caballo1.color);
	//	9. Ponerle color marrón
		caballo1.setColor("marrón");
	// 	9. Imprimir color
		System.out.println(caballo1.color);
		*/
	//	14. Llamar al método imprimeCarrerasGanadas
		//caballo1.imprimeCarrerasGanadas(); Lo comento porque da error al comentarlo en la clase caballo
	//	17. Llamar la método anyoNacimiento
		caballo1.setEdad(4);
		caballo1.anyoNacimiento();
	}

}
