package ejemplo06anotaciones.negocio;

import java.util.List;

import ejemplo06anotaciones.dao.PeliculasDAO;
import ejemplo06anotaciones.modelo.Pelicula;

public class NegocioPelis {


	private PeliculasDAO peliculasDao;
	
	public PeliculasDAO getPeliculasDao() {
		return peliculasDao;
	}

	public void setPeliculasDao(PeliculasDAO peliculasDao) {
		this.peliculasDao = peliculasDao;
	}


	public boolean guardala(Pelicula peli) {
		return peliculasDao.savePelicula(peli);
	}

	public List<Pelicula> aVerLoQueTengo() {
		return peliculasDao.getPeliculas();
	}
}
