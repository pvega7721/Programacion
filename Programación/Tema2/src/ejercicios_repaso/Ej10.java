package ejercicios_repaso;

import java.util.Scanner;

public class Ej10 {

	private static final String PUNTO = ".";
	private static final String BARRAS = "://";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe una URL: ");
		String url = scanner.nextLine();
		
		int indiceProtocolo = url.indexOf(BARRAS);
		
		int indicePPunto= url.indexOf(PUNTO);
		
		int indiceUPunto= url.lastIndexOf (PUNTO);
		
		if (indiceProtocolo!= -1 && indicePPunto != -1 && indiceUPunto!=indicePPunto)
		{
			System.out.println(url.substring(0,indiceProtocolo +3));
			System.out.println(url.substring(indiceProtocolo +3, indicePPunto));
			System.out.println(url.substring(indicePPunto +1, indiceUPunto));
			System.out.println(url.substring(indiceUPunto));
		}
		
		else{
		System.out.println("La cadena no cumple el formato correcto");	
		}
		
			
		scanner.close();
	}

}
