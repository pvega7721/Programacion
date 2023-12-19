package tema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//Le pedimos al usuario el precio del producto
		System.out.println("¿Cuánto cuesta el producto?");
		//Esperamos a que responda
		float precioProducto = scanner.nextFloat();

		float iva = (float) 0.21;
		//Multiplicamos el precio dado por el usuario por el IVA
		float precioIva = precioProducto * iva;
		//Creamos una variable en la que sumamos el precio indicado por el usuario con el precio del IVA
		float precioTotal = precioIva + precioProducto;
		//Mostramos el resultado al usuario
		System.out.println("El precio final del producto es de " + precioTotal + "€");
		
		scanner.close();
		
		
		
	}

}
