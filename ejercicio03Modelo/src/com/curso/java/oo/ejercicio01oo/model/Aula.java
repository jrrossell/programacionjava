package com.curso.java.oo.ejercicio01oo.model;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Aula {
	
	private String nombre;
	private Boolean proyector;
	private Boolean pizarra;
	@Autowired
	@Qualifier("puestosDeProfesores")
	private Set<PuestoDeTrabajo> puestoDelProfesor;
	@Autowired
	@Qualifier("puestosDeAlumnos")
	private Set<PuestoDeTrabajo> puestosDeAlumnos;
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Boolean getProyector() {
		return proyector;
	}


	public void setProyector(Boolean proyector) {
		this.proyector = proyector;
	}


	public Boolean getPizarra() {
		return pizarra;
	}


	public void setPizarra(Boolean pizarra) {
		this.pizarra = pizarra;
	}


	public Set<PuestoDeTrabajo> getPuestoDelProfesor() {
		return puestoDelProfesor;
	}


	public void setPuestoDelProfesor(Set<PuestoDeTrabajo> puestoDelProfesor) {
		this.puestoDelProfesor = puestoDelProfesor;
	}


	public Set<PuestoDeTrabajo> getPuestosDeAlumnos() {
		return puestosDeAlumnos;
	}


	public void setPuestosDeAlumnos(Set<PuestoDeTrabajo> puestosDeAlumnos) {
		this.puestosDeAlumnos = puestosDeAlumnos;
	}

	@Override
	public String toString() {
		return "Aula [nombre=" + nombre + "]";
	}

}