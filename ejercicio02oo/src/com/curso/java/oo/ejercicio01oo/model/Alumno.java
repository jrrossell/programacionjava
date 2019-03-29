package com.curso.java.oo.ejercicio01oo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
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
