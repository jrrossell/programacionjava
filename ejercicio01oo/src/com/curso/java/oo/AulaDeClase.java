package com.curso.java.oo;

import com.curso.java.oo.model.Personas;
import com.curso.java.oo.model.TipoPersona;

public class AulaDeClase {

	public static void main(String[] args) {


		Personas personas = new Personas();

		
		personas.setNombre("Junior");
		System.out.println(personas.getNombre());
		
		personas.setTipoPersona(TipoPersona.ALUMNO);
		System.out.println(personas.getTipoPersona());
	}
}
