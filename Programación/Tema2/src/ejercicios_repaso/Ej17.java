package ejercicios_repaso;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		int num1 = 1;
		int num2 = 0;
		
		do {
			System.out.println("Introduce un número mayor a 2: ");
			num = scanner.nextInt();
			
		}while(num<2);
			
			for(int i = 0; i<num ;i++) {
				
				if (i == 0) {
					System.out.print(num2 + ",");
				}else if (i == num-1) {
					num1 = num1+num2;
					num2 = num1 - num2;
					System.out.println(num2);
				}else {
				num1 = num1+num2;
				num2 = num1 - num2;
				System.out.print(num2 + ",");
				}
			}
		
		scanner.close();
	}

	}
