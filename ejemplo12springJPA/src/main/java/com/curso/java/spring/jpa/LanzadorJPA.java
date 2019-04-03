package com.curso.java.spring.jpa;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.curso.java.spring.jpa.config.Configuracion;
import com.curso.java.spring.jpa.model.business.GestionPeliculas;
import com.curso.java.spring.jpa.model.entities.Pelicula;

public class LanzadorJPA {
	
	private static ApplicationContext context;
	
	static {
		context = new AnnotationConfigApplicationContext(Configuracion.class);
	}
	
	public static void main(String[] args) {
		System.out.println("Inicializamos la base de datos");
		Pelicula pelicula = new Pelicula();
		pelicula.setTitulo("La dama y el moribundo");
		pelicula.setDirector("Tor");
		pelicula.setYear(1980);
		
		GestionPeliculas gestionPeliculas = context.getBean(GestionPeliculas.class);
		
		gestionPeliculas.insertar(pelicula);
		System.out.println("Pelicula insertada");
		List<Pelicula> peliculas = gestionPeliculas.listar();
		System.out.println(peliculas);
	}
}
