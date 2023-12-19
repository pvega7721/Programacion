package tema2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//Pedimos al usuario el precio sin iva
		 System.out.println("Introduce el precio sin IVA:");
        double sinIVA = scanner.nextDouble();
        
        // Solicitamos el tipo de IVA al usuario
        System.out.println("Introduzca el tipo de IVA (Normal, Reducido, Superreducido, Exento):");
        //Lo guardamos en una variable
        String tipoIVA = scanner.next();
        
        double tasaIVA = 0.0;
        
       
        if ("Normal".equals(tipoIVA)) {
            tasaIVA = 0.21;
        } else if ("Reducido".equals(tipoIVA)) {
            tasaIVA = 0.10;
        } else if ("Superreducido".equals(tipoIVA)) {
            tasaIVA = 0.04;
        } else if ("Exento".equals(tipoIVA)) {
            tasaIVA = 0.0;
        } else {
            System.out.println("Tipo de IVA no válido.");
            scanner.close();
        }
        
        
        // Calcular el precio con IVA
        double conIVA = sinIVA * (1 + tasaIVA);
        
        
        // Mostramos el resultado al usuario
        System.out.printf("El precio con IVA es:" + conIVA + "€");
        
        
    }
}

