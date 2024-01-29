package ejercicio38;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PilaCadenas pila1 = new PilaCadenas();
		
		pila1.añadirCadena("Primero");
		pila1.añadirCadena("Segundo");
		System.out.println(pila1);
		
		String elemento = pila1.sacarCadena();
		System.out.println(elemento);
		
		pila1.añadirCadena("tercero");
		while(pila1.getTamaño() > 0) {
			String elemento1 =pila1.sacarCadena();
			System.out.println(elemento1);
		}
		pila1.añadirCadena("Cuarto");
		System.out.println(pila1);
	}

}
