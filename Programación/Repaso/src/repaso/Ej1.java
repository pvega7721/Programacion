package repaso;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int[] pares = new int[15];
		
		int contador=2;
		
		for(int i=0;i<pares.length;i++) {
			pares[i]=contador;
			contador+=2;
			System.out.print(pares[i]+ " ");
		}
			
		
		
		
		
	}
		

}
