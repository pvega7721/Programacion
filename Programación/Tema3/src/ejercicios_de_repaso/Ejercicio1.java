package ejercicios_de_repaso;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10};
		
		int contador = 0;
	
		//Con bucle for
		for (int i = 0; i < listaNotas.length; i++) {
			if(listaNotas[i]<5) {
				contador++;
			}
	
		}
		System.out.println("Total alumnos suspensos: " + contador);

		
		//Con foreach
		int contador2=0;
		for (Integer integer : listaNotas) {
			if (integer<5) {
				contador2++;
			}
		}
		System.out.println("Total alumnos suspensos: " + contador2);
		
	}

}
