package ejercicios_prácticos;

import java.util.Scanner;

public class Cuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el número de lados del cuadrado: ");
		Scanner sc = new Scanner(System.in);
		Integer numeroLados;
		
		do {
			numeroLados = sc.nextInt();
			
		}while(numeroLados<=0);
		
		for (int i = 0; i < numeroLados; i++) {
			
			for (int j = 0; j < numeroLados; j++) {
				
				if(i==0 || i == (numeroLados-1) || j==0 || j==(numeroLados-1)) {
					System.out.print("*");
				}
				else
					System.out.print("_");
					sc.close();
			}
		}
	}

}
