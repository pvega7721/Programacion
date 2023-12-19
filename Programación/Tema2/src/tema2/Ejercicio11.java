package tema2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String correo;
		
		boolean correoValido = true;
		
		do { // pedimos el correo al usuario
			System.out.println("Introduce tu correo electrónico: ");
			correo = scanner.nextLine();
			
			//Creamos una variable booleana que contenga si el correo introducido tiene o no arroba
			boolean arroba = correo.contains("@");
			
			int indiceArroba = correo.indexOf("@");
			
			String subcadena = correo.substring(indiceArroba + 1);
			
			//si el correo no contiene '@', 'correoValido' es falso, osea que el correo no es valido
			if (!correo.contains("@")) {
				correoValido = false;
			}
			//si el correo contiene '@.', 'correoValido' es falso, osea que el correo no es valido
			else if (correo.contains("@.")) {
				correoValido = false;
			}
			//si el correo termina con un punto, 'correoValido' es falso, osea que el correo no es valido
			else if (correo.endsWith(".")) {
				correoValido = false;
			}
			else if (!subcadena.contains(".")) {
				correoValido = false;
			}
			
		} while(!correoValido);
		
			System.out.println("Correo electrónico correcto");
		
		
		scanner.close();
		
		
		
	}
	
}
