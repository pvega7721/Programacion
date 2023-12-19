package ejercicios_repaso;

public class Ej20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int fila= 0; fila<5; fila++) {
			
			for(int col=0; col<5; col++) {
			
				//System.out.print("-");
				if(fila == col) {
					System.out.print("*");
					
				}
				else
					System.out.print("-");
			}
			System.out.println();
		
				
		}
	}

}
