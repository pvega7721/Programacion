package ejercicios_prácticos;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[][] tabla = new Integer[10][10];
		
		for (int i = 0; i<tabla.length; i++) {
			for (int j = 0; j<tabla[i].length;j++)
				tabla[i][j] = i*j;
		}
		for (int i=0; i<tabla.length; i++) {
			for (int j=0; j<tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
				
		}
	}

}
