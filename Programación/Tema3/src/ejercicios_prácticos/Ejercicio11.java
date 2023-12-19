package ejercicios_prácticos;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[][] array = new Integer[5][10];
		int contador = 1;
		
		for(int fila=0; fila< array.length; fila++) {
			for(int col=0; col < array[fila].length; col++) {
				array[fila][col] = contador;
				contador++;
			}
			
		}
		
		//recorremos el array de 10 en 10
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}		
	}
}