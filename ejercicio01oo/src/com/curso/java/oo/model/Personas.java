package com.curso.java.oo.model;

public class Personas {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private TipoPersona tipoPersona;
	private String telefono;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	public TipoPersona getTipoPersona() {
		return tipoPersona;
	}
	
	public void setTipoPersona(TipoPersona alumno) {
		this.tipoPersona = alumno;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
