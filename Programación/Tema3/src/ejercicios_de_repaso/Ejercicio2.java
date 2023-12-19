package ejercicios_de_repaso;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10};
		
		int media=0;
		int contador=0;
		int notas=0;
		for (int i = 0; i < listaNotas.length; i++) {
			if(listaNotas[i]>4) {
				contador++;
				notas += listaNotas[i];
			}
			media = notas/contador;
		}
	
		
		System.out.println("Nota media de aprobados: " + media);
	
		
	}

}
