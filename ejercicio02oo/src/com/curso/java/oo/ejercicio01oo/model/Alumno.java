package com.curso.java.oo.ejercicio01oo.model;

public class Alumno extends Persona {

	private boolean subvencionado;
	
	public Alumno(String nombre, boolean subvencionado) {
		super(nombre);
		this.subvencionado = subvencionado;
	}
	
	public boolean isSubvencionado() {
		return subvencionado;
	}

	public void setSubvencionado(boolean subvencionado) {
		this.subvencionado = subvencionado;
	}
}
