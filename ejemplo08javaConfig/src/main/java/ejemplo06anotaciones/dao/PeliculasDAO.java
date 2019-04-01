package ejemplo06anotaciones.dao;

import java.util.List;

import ejemplo06anotaciones.modelo.Pelicula;

public class PeliculasDAO {

	private List<Pelicula> peliculas;

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public boolean savePelicula(Pelicula pelicula) {
		return peliculas.add(pelicula);
	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}
}
