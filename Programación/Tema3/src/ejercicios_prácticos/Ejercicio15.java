package ejercicios_prácticos;

import java.util.Scanner;

public class Ejercicio15 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una url");
		
		String url = sc.nextLine();
		
		
		String[] array1 = url.split("://");
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
	
		int punto = url.lastIndexOf(".");
		
		String[] array3 = url.split(url, url.lastIndexOf("."));
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		
		
		
		sc.close();
		
	}

}
