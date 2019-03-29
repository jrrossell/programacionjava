package com.curso.java.oo.ejercicio01oo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Profesor extends Persona {
	private boolean malaLeche;

	public boolean isMalaLeche() {
		return malaLeche;
	}

	public void setMalaLeche(boolean malaLeche) {
		this.malaLeche = malaLeche;
	}
}