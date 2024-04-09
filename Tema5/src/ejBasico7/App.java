package ejBasico7;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sociedad sociedad1 = new Sociedad();
		sociedad1.addPersona("h", new BigDecimal(12));
		sociedad1.addPersona("h", new BigDecimal(15));
		System.out.println(sociedad1.calcularAlturaMediaHombres());
	}

}
