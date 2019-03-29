package com.curso.java.oo.ejercicio01oo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class PuestoDeTrabajo {
	private boolean ordenador;
	private Persona persona;
	public PuestoDeTrabajo(boolean ordenador) {
		this.ordenador = ordenador;
	}
	public boolean isOrdenador() {
		return ordenador;
	}
	public void setOrdenador(boolean ordenador) {
		this.ordenador = ordenador;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
}