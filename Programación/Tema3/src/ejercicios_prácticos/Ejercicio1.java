package ejercicios_prácticos;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numPares = new int[15];
		
		int contador = 2;
		
		for(int i = 0;i <numPares.length; i++) {
			 numPares[i] = contador;
			 contador = contador +2;
			 System.out.print(numPares[i] + " ");
		}
		
		
		
		
	}

}
