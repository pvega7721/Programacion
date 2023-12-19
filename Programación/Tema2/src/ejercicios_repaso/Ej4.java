package ejercicios_repaso;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double precio = 0;
		double uds = 0;
		double total = 0;
		System.out.println("Introduce el número total de unidades");
		uds = scanner.nextFloat();
		
		System.out.println("Introduce el precio por unidad");
		precio = scanner.nextFloat();
		
		total = (precio * uds);
		
		double descuentoGrande = (total * 0.4);
		double descuentoMediano = (total * 0.2);
		double descuentoPequeno = (total * 0.1);
		
		if (uds >= 100) {
			System.out.println("-Subtotal = " + uds + " X " + precio + "= " + total + "euros" );
			System.out.println("-Descuento = 40% de " + total + "= " + descuentoGrande + "euros");
			System.out.println("-Total = " + total + " - " + descuentoGrande + "= " + (total - descuentoGrande) + "euros" );
		}
		else if (uds >=25) {
			System.out.println("-Subtotal = " + uds + " X " + precio + "= " + total + "euros" );
			System.out.println("-Descuento = 20% de " + total + "= " + descuentoMediano + "euros");
			System.out.println("-Total = " + total + " - " + descuentoMediano + "= " + (total - descuentoMediano) + "euros" );
		}
		else if (uds >=10) {
			System.out.println("-Subtotal = " + uds + " X " + precio + "= " + total + "euros" );
			System.out.println("-Descuento = 10% de " + total + "= " + descuentoPequeno + "euros");
			System.out.println("-Total = " + total + " - " + descuentoPequeno + "= " + (total - descuentoPequeno) + "euros" );
		}
		else if (uds <10) {
			System.out.println("-Subtotal = " + uds + " X " + precio + "= " + total + "euros" );
			System.out.println("-Descuento = 0% de " + total + "= " + 0 + "euros");
			System.out.println("-Total = " + total + " - " + 0 + "= " + (total - 0) + "euros" );
		}
		
		
		
		scanner.close();
		
	}

}
