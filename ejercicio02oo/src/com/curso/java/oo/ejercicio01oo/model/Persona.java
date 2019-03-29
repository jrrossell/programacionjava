package com.curso.java.oo.ejercicio01oo.model;

import org.springframework.stereotype.Component;

@Component
public class Persona {
	
	private String nombre;

	public Persona() {
		super();
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
}
