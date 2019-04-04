package com.curso.java.spring.jpa.model.dao;

import java.util.List;

import com.curso.java.spring.jpa.model.entities.Pelicula;

public interface PeliculaDAO {
	void insertar(Pelicula pelicula);
	void modificar(Pelicula pelicula);
	void borrar(Pelicula pelicula);
	Pelicula buscar(int id);
	List<Pelicula> listar();
}
