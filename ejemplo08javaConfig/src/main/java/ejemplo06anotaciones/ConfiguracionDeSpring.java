package ejemplo06anotaciones;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import ejemplo06anotaciones.dao.PeliculasDAO;
import ejemplo06anotaciones.modelo.Director;
import ejemplo06anotaciones.modelo.Pelicula;
import ejemplo06anotaciones.negocio.NegocioPelis;

@Configuration
public class ConfiguracionDeSpring {

	@Bean("directorBean")
	@Scope("prototype")
	public Director getDirector() {
		return new Director();
	}

	@Bean
	@Scope("prototype")
	public Pelicula pelicula(@Qualifier("directorBean") Director director) {
		Pelicula pelicula = new Pelicula();
		pelicula.setDirector(director);
		return pelicula;

	}

	@Bean("listaPeliculas")
	public List<Pelicula> listaPeliculas() {
		return new ArrayList<>();
	}
	@Bean("peliculaDao")
	public PeliculasDAO getPeliculasDao(@Qualifier("listaPeliculas") List<Pelicula> listaPeliculas) {
		PeliculasDAO dao = new PeliculasDAO();
		dao.setPeliculas(listaPeliculas);
		return dao;
	}
	@Bean("negocioPelis")
	public NegocioPelis getNegocioPelis(PeliculasDAO dao) {
		NegocioPelis pelis = new NegocioPelis();
		pelis.setPeliculasDao(dao);
		return pelis;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
