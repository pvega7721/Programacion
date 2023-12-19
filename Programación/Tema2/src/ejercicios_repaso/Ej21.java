package ejercicios_repaso;

import java.util.Scanner;

public class Ej21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		int x = 0;
		
		do {
			System.out.println("Introduce un número mayor a 0:");
			 x = scanner.nextInt();	
		}while (x <= 0);
		
		for(int fila= 0; fila < x; fila++) {
			
			for(int col=0; col < x; col++) {
			
				//System.out.print("-");
				if(fila == col) {
					System.out.print("*");
				}
				else
					System.out.print("-");
			}
			System.out.println();
		scanner.close();
				
		}
	}

}
