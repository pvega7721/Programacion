package examen.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Productora {

	private String nombre;
	private List<Actor> elenco;
	private List<Pelicula> listaPeliculas;

//FALTA
	public BigDecimal getCostePelicula(String titulo) {
		for (int i = 0; i < listaPeliculas.size() - 1; i++) {
			// salario del primer actor de la pelicula
			listaPeliculas.get(i).getReparto().get(i).getCache();
		}
		return null;
	}

//
	public List<Pelicula> getLargometrajesEstrenadosConBeneficios() {
		List<Pelicula> LargometrajesEstrenadosConBeneficios = new ArrayList<>();
		try {
			for (Pelicula pelicula : listaPeliculas) {
				// si la pelicula está estrenada, dura más de 60 minutos y tiene beneficios, se
				// añade a la lista.
				if (LocalDate.now().isAfter(pelicula.getfechaEstreno()) && pelicula.getDuracion() > 60
						&& pelicula.getBeneficios().compareTo(BigDecimal.ZERO) == 1) {
					LargometrajesEstrenadosConBeneficios.add(pelicula);
				}
			}
			return LargometrajesEstrenadosConBeneficios;

		} catch (NullPointerException e) {
			System.out.println("No se puede acceder a la posición de la lista");
			return null;
		}
	}

	public Map<String, List<Actor>> getMapaActores() {
		Map<String, List<Actor>> mapaActores = new HashMap<>();
		try {
			for (int i = 0; i < listaPeliculas.size() - 1; i++) {
				mapaActores.put(listaPeliculas.get(i).getTitulo(), listaPeliculas.get(i).getReparto());

			}
		} catch (NullPointerException e) {
			System.out.println("No se puede acceder a la posición de la lista");
			return null;
		}
		return mapaActores;
	}

	public Pelicula getPeliculaMenorReparto() {
		try {

			for (int i = 0; i < listaPeliculas.size() - 1; i++) {
				Pelicula peliculaMenorReparto = listaPeliculas.get(i);
				if (listaPeliculas.get(i).getReparto().size() < peliculaMenorReparto.getReparto().size()) {
					peliculaMenorReparto = listaPeliculas.get(i);
				} else {
					return peliculaMenorReparto;
				}
			}
		} catch (NullPointerException e) {
			System.out.println("No hay películas");
			return null;
		}
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Actor> getElenco() {
		return elenco;
	}

	public void setElenco(List<Actor> elenco) {
		this.elenco = elenco;
	}

	public List<Pelicula> getListaPeliculas() {
		return listaPeliculas;
	}

	public void setListaPeliculas(List<Pelicula> listaPeliculas) {
		this.listaPeliculas = listaPeliculas;
	}

	@Override
	public String toString() {
		return ">>>> Productora: " + nombre + " <<<<" + "\nPeliculas: " + listaPeliculas;
	}

}
