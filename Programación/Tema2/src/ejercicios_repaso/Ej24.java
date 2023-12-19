package ejercicios_repaso;

import java.util.Scanner;

public class Ej24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		do {
			System.out.println("Introduce un número mayor a 0");
			 n = sc.nextInt();	
		}while(n <= 0);
		int suma=0;
		for(int i = 1; i <=n; i++) {
			if ((i%2==1)) {
				
				suma += i;//va acumulando los números impares
			}
			
		}
		sc.close();
		System.out.println("La suma de los números impares del 1 al " + n + " es " + suma);
	}

}
