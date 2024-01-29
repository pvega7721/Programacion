package ejercicio37;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear objeto cola
		ColaCadenas cola = new ColaCadenas();
		System.out.println("1:" + cola);
		
		//
		cola.añadirCadena("primero");
		cola.añadirCadena("Segundo");
		System.out.println("2: " + cola);
		System.out.println(cola);
		
		//3. Saca de la cola un elemento e imprimelo
		String elemento = cola.sacarCadena();
		System.out.println("3: " + elemento);
		
		//4. Añade a la cola la palabra "tercero"
		cola.añadirCadena("Tercero");
		System.out.println("4: " + cola);
		
		//5. saca todos los elementos que queden en la cola e imprímelos.
		while(cola.getTamaño() > 0) {
			elemento = cola.sacarCadena();
			System.out.println(elemento);
		}
		System.out.println("5: " + cola);
		
		//6. Añade a la cola la palabra "cuarto"
		cola.añadirCadena("cuarto");
		System.out.println("6: " + cola);
		
	}

}
