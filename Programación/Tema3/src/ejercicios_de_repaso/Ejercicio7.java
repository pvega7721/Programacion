package ejercicios_de_repaso;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase = sc.nextLine();
		String[] telegrama = frase.split("STOP");
		
		int contador = 0;		
		
		String total="";
		for (int i = 0; i < telegrama.length; i++) {
			total += telegrama[i];
					
		}
		
		String[] completa = total.split(" ");
		
		for (int i = 0; i < completa.length; i++) {
			contador++;
					
		}
		
		System.out.println();
		System.out.println("El precio es de: " + (contador*0.24) + "€");
		
	sc.close();	
	}

}
