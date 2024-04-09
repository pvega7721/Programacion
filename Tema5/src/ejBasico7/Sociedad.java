package Tema5.src.ejBasico7;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Sociedad {
	private Set<Persona> personas;

	public Sociedad() {
		personas = new HashSet<>();
	}

	// faltan las excepciones
	public void addPersona(String genero, BigDecimal altura) {
		Persona persona1 = new Persona(genero, altura);
		personas.add(persona1);
	}

	public BigDecimal calcularAlturaMediaHombres() {
		BigDecimal suma = BigDecimal.ZERO;
		BigDecimal media = BigDecimal.ZERO;
		
		try {
			if(!personas.isEmpty()) {
				for (Persona persona : personas) {
					if(persona.genero.equalsIgnoreCase("h")) {
						suma = suma.add(persona.getAltura());
					}else {
						System.out.println("No hay hombres en la lista");
						break;
					}
				}
				media = suma.divide(new BigDecimal(personas.size()));
				return media;
			}else {
				throw new ListaVaciaException("La lista está vacía");
			}
		}catch(ListaVaciaException e) {
			System.out.println(e.getMessage());
		}
	}

}
