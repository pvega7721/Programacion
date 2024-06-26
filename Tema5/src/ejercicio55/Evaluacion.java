package ejercicio55;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Evaluacion {

	private Map<String, BigDecimal> notas;

	public Evaluacion() {
		notas = new HashMap<>();
	}

	// paso1
	public boolean addNota(String dni, BigDecimal nota) {

		if (dni == null || notas != null) {
			return false;
		}
		if (notas.containsKey(dni)) {
			return false;
		} else {
			notas.put(dni, nota);
			return true;
		}
	}

	// paso2
	public boolean corregirNota(String dni, BigDecimal nota) {
		if (dni == null || nota == null) {
			return false;
		}

		if (notas.containsKey(dni)) {
			notas.put(dni, nota);
			return true;
		}
		return false;
	}

	// paso3
	public BigDecimal obtenerNotaAlumno(String dni) {
		if (notas.containsKey(dni)) {
			return notas.get(dni);
		} else {
			return BigDecimal.ZERO;
		}
	}

	// paso4
	public BigDecimal obtenerNotaMedia() {

		if (notas.isEmpty()) {
			return BigDecimal.ZERO; // Si no hay ninguna nota en el mapa, la nota media es cero.
		}
		BigDecimal contador = BigDecimal.ZERO;
		Set<String> mapaNotas = notas.keySet();
		for (String dni : mapaNotas) {
			contador = contador.add(notas.get(dni));
		}
		BigDecimal x = new BigDecimal(notas.size());
		BigDecimal notaMedia = contador.divide(x, 2, RoundingMode.HALF_DOWN);
		return notaMedia;
	}

	// paso5
	public Integer obtenerCantidadAprobados() {
		Integer aprobados = 0;
		Set<String> mapaNotas = notas.keySet();
		for (String dni : mapaNotas) {
			if (notas.get(dni).compareTo(BigDecimal.valueOf(5.0)) >= 0) {
				aprobados++;
			}
		}
		return aprobados;
	}

	// paso6
	public List<String> obtenerSuspensos() {
		List<String> suspensos = new ArrayList<>();
		Set<String> mapaNotas = notas.keySet();
		for (String dni : mapaNotas) {
			if (notas.get(dni).compareTo(BigDecimal.valueOf(5.0)) < 0) {
				suspensos.add(dni);
			}
		}
		return suspensos;
	}

	// paso7
	public void borrarAprobados() {
		Set<String> dnis = notas.keySet();
		Iterator<String> it = dnis.iterator();
		while (it.hasNext()) {
			// (String) convierte lo que devuelva it.next a String, para que no haya errores
			// de conversión.
			String dni = (String) it.next();
			if (notas.get(dni).compareTo(BigDecimal.valueOf(5.0)) >= 0) {
				it.remove();
			}
		}
	}
	// paso8

	@Override
	public String toString() {
		DecimalFormat ft = new DecimalFormat("#.00");
		String aprobados = "Aprobados:\n";
		String suspensos = "Suspensos:\n";

		Set<String> dnis = notas.keySet();
		for (String dni : dnis) {
			String linea = "\t" + dni + " (" + ft.format(notas.get(dni)) + ")\n";
			if (notas.get(dni).compareTo(BigDecimal.valueOf(5.0)) >= 0) {
				aprobados += linea;
			} else {
				suspensos += linea;
			}
		}
		return aprobados + "\n" + suspensos;
	}

}
