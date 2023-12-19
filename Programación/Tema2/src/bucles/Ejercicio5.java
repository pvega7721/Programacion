package bucles;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador = 1;
		int suma = 0;
		
		while (contador <=10000) {
			suma += contador; // suma = suma + contador
			contador++; //contador = contador +1;
		}
		System.out.println("La suma de todos los números del 1 al 10000 es: " + suma);
		
	}

}
 