package repasoT2;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int suma=0;
		int num=0;
		do {
			System.out.println("\n Introduce un número del 1 al 10");
			num = sc.nextInt();
			suma=0;
			
			if (num>10 || num<0) {
				System.out.println("Numero incorrecto");
			}
			else if(num==0) {
				break;
			}
			else {
				for (int i = 1; i <=10; i++) {
					int numero = i*num;
					suma +=numero;
					if(i == 10) {
						System.out.print(numero + "=" + suma);
					}else {
						System.out.print(numero + "+");
					}
				}
			}
			
		} while (num != 0);
		
		sc.close();
	}

}
