package ejercicios_repaso;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Boolean repetir; 
		
		do {
			System.out.println("Escribe el mensaje:  ");
			String texto = scanner.nextLine();
		
		if (texto.startsWith("Hola") && texto.endsWith("hasta luego"))
		{
			String mensaje=texto.substring(texto.indexOf('a') +1, texto.lastIndexOf ("hasta luego"));
			System.out.println("Lo he entendido. Mensaje: " + mensaje.trim());
			repetir = true;
		}
		else if (texto.startsWith("Hola") && texto.endsWith("Adios"))
		{
			String mensaje = texto.substring(texto.indexOf('a') + 1, texto.lastIndexOf ("Adios"));
			System.out.println("Lo he entendido. Mensaje: " + mensaje.trim());
			repetir = false;
		}
		else 
		{
			System.out.println("Lo siento, no he entendido el mensaje");
			repetir = true;
		}
		
		}while(repetir);
		
		
		scanner.close();
	}

}
