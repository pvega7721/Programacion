package ejercicios_repaso;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un número mayor a cero: ");
		int numero = scanner.nextInt();
	
		System.out.print(" __");
		
		for (int i = 1; i < numero; i++) {
			System.out.print("___");
		}
		if (numero >= 0) {
			
	        	for (int i = 0; i < numero; i++) {
	        		
	        		System.out.println("");
	                
	            	for (int j = 0; j < numero; j++) {
	                    
	            			System.out.print("|__");
	                }
	                System.out.print("|");
	        	} 
			 
			
		}else {
         System.out.println("El número debe ser mayor a cero");
          
        }
                
		scanner.close();
	}

}

