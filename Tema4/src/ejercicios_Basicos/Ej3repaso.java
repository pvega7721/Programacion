package ejercicios_Basicos;

import java.util.Random;
import java.util.Scanner;

public class Ej3repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		Integer numero = random.nextInt(1,3);
		System.out.println("Introduce una palabra");
		String palabra = sc.nextLine();
		
		String ej3 = getMayMin(palabra, numero);
		System.out.println(ej3);
		sc.close();
	}
	public static String getMayMin(String palabra, Integer numero) {
		if(numero==1){
			return palabra.trim().toUpperCase();
		}else {
			return palabra.trim().toLowerCase();
		}
	}
}
