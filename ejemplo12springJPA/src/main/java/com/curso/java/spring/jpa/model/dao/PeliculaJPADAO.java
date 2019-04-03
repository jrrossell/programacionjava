package com.curso.java.spring.jpa.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.curso.java.spring.jpa.model.entities.Pelicula;

@Repository
public class PeliculaJPADAO implements PeliculaDAO {

	@PersistenceContext
	private EntityManager manager;
	
	public void insertar(Pelicula pelicula) {
		manager.persist(pelicula);

	}

	public void modificar(Pelicula pelicula) {
		manager.merge(pelicula);

	}

	public void borrar(Pelicula pelicula) {
		Pelicula peliculaABorrar = buscar(pelicula.getId());
		manager.remove(peliculaABorrar);

	}

	public Pelicula buscar(int id) {	
		return manager.find(Pelicula.class, id);
	}

	public List<Pelicula> listar() {
		String query = "select p from Pelicula p";
		return manager.createQuery(query).getResultList();
		
	}

	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

}
