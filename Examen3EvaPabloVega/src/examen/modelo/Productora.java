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
		List<Pelicula> largometrajesEstrenadosConBeneficios = new ArrayList<>();
		for (Pelicula pelicula : listaPeliculas) {
			// si la pelicula está estrenada, dura más de 60 minutos y tiene beneficios, se
			// añade a la lista.
			if (LocalDate.now().isAfter(pelicula.getfechaEstreno()) && pelicula.getDuracion() > 60
					&& pelicula.getBeneficios().compareTo(BigDecimal.ZERO) == 1) {
				largometrajesEstrenadosConBeneficios.add(pelicula);
			}
		}
		return largometrajesEstrenadosConBeneficios;
	}

	public Map<String, List<Actor>> getMapaActores() {
		Map<String, List<Actor>> mapaActores = new HashMap<>();

		for (int i = 0; i < listaPeliculas.size(); i++) {
			mapaActores.put(listaPeliculas.get(i).getTitulo(), listaPeliculas.get(i).getReparto());

		}

		return mapaActores;
	}

	public Pelicula getPeliculaMenorReparto() {

		Pelicula peliculaMenorReparto = null;
		for (int i = 0; i < listaPeliculas.size(); i++) {
			if (listaPeliculas.get(i).getReparto().size() < peliculaMenorReparto.getReparto().size()) {
				peliculaMenorReparto = listaPeliculas.get(i);
			} else {
			}
		}
		return peliculaMenorReparto;

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
		//Hay que recorrer la lista de peliculas y llamar a toString() de películas
		return ">>>> Productora: " + nombre + " <<<<" + "\nPeliculas: " + listaPeliculas;
	}

}
