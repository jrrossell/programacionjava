package ejercicio03Lanzador;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
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
		gestionAulas.registrarAula("Aula3", true, true, puestosDeAlumnos);
		
		System.out.println("-- Lista de Aulas --");
		List<Aula> aula = gestionAulas.getAula();
		for(Aula siguienteAula : aula) {
			System.out.println(siguienteAula.getNombre());
		}
		
		System.out.println();
		gestionAulas.eliminarAula("Kepler");
		System.out.println("Aula Eliminada ");
		
		System.out.println();
		System.out.println("-- Lista de Aulas --");
		List<Aula> aula2 = gestionAulas.getAula();
		for(Aula siguienteAula : aula2) {
			System.out.println(siguienteAula.getNombre());
		}
		
		Aula aula3 = new Aula("Aula3", true, true, puestosDeAlumnos);
		Alumno alumno1 = new Alumno("Junior", true);
		Alumno alumno2 = new Alumno("Manuel", true);
		gestionAulas.asignarAlumnoAlAula(alumno1, aula3);
		gestionAulas.asignarAlumnoAlAula(alumno2, aula3);
		
		
		System.out.println();
		System.out.println("-- Lista de Alumnos en Aula3 --");
		List<Alumno> alumnos = (List<Alumno>) gestionAulas.listaDeAlumnoPorAula("Aula3");
		for(Alumno siguienteAlumno : alumnos) {
			System.out.println(siguienteAlumno.getNombre());
		}
	}

}
