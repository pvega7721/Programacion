package ejercicios_prácticos;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] array = new double[]{5.4, 3.1, 9.0, 4.7};
	
		for(double num : array) {
			System.out.println(num);
		}
		
		double contador = 0.0;
		for (double num: array) {
			contador+=num;
		}
		System.out.println();
		System.out.println("la suma del array es: " + contador);
		
	}

}
