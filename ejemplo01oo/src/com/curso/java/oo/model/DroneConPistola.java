package com.curso.java.oo.model;

public class DroneConPistola extends Maquina implements PuedeDisparar{

	@Override
	void cargarse() {
		System.out.println("Cargando con cargador");
	}

	@Override
	public void dispararSinJuicio(String Objetivo) {
		System.out.println("Disparando con el drone a " + Objetivo);
	}

}
