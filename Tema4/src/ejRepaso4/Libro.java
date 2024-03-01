package ejRepaso4;

import java.time.LocalDate;

public abstract class Libro {
	protected String titulo;
	protected String autor;
	protected LocalDate fechaEdicion;
	protected Integer numPaginas;
	private Integer peso;
	
	public Libro(){
	
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public LocalDate getFechaEdicion() {
		return fechaEdicion;
	}
	public void setFechaEdicion(LocalDate fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}
	public Integer getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(Integer numPaginas) {
		this.numPaginas = numPaginas;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", fechaEdicion=" + fechaEdicion + ", numPaginas="
				+ numPaginas + ", peso=" + peso + "]";
	}
	
	
}
