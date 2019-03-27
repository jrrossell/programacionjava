package ejercicio03Lanzador;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

import ejercicio03Dao.ListAulaDao;
import ejercicio03Negocio.GestionDeAulas;

public class LanzadorAulas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<PuestoDeTrabajo> puestosDeAlumnos = new HashSet<PuestoDeTrabajo>();
		
		PuestoDeTrabajo puesto = new PuestoDeTrabajo(true);
		PuestoDeTrabajo puesto1 = new PuestoDeTrabajo(true);
		puestosDeAlumnos.add(puesto);
		puestosDeAlumnos.add(puesto1);
		
		GestionDeAulas gestionAulas = new GestionDeAulas(new ListAulaDao());
		gestionAulas.registrarAula("Kepler", true, true, puestosDeAlumnos);
		gestionAulas.asignarAlumno("kepler");
		Collection<Alumno> listaDeAlumnoPorAula = gestionAulas.listaDeAlumnoPorAula("kepler");
		
	}

}
