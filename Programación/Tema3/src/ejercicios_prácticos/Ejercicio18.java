package ejercicios_prácticos;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//le doy la vuelta al número, si es igual que el número original, el número es capicuo.		
		System.out.println("Introduce un número de al menos dos cifras");
		String num = sc.nextLine();
		
		String[] array = num.split("");
		//int i;
		//int j = array.length-1;
		//boolean igual=true;
		
		String ire="";
		String jre="";
		
		for (int i=0; i<array.length; i++) {
			ire += array[i];
		}

		
		for (int j=array.length-1; j>=0; j--) {
			jre += array[j];
		}	
		
		
		if(ire.equals(jre)) {
			System.out.println("el número es capicuo");
		}
		else {
			System.out.println("El número no es capicuo");
		}

		sc.close();
	}

}
