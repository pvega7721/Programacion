package ejercicios_Basicos;

import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		int num = random.nextInt(1,3);
		
		String resultado = getMayMin(num, "Hola");
		System.out.println(resultado);
		
	}

	public static String getMayMin(int num, String string) {
		// TODO Auto-generated method stub
		
		if(num==1) {
			string=string.trim().toUpperCase();
			
		}else{
			string = string.trim().toLowerCase();
		}
		
		return string;
	}

}
