package ejercicio03Lanzador;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

import ejercicio03Dao.MapAulaDao;
import ejercicio03Negocio.GestionDeAulas;

public class LanzadorAulasMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<PuestoDeTrabajo> puestosDeAlumnos = new HashSet<PuestoDeTrabajo>();
		
		PuestoDeTrabajo puesto1 = new PuestoDeTrabajo(true);
		PuestoDeTrabajo puesto2 = new PuestoDeTrabajo(true);
		PuestoDeTrabajo puesto3 = new PuestoDeTrabajo(true);
		puestosDeAlumnos.add(puesto1);
		puestosDeAlumnos.add(puesto2);
		puestosDeAlumnos.add(puesto3);
		
		GestionDeAulas gestionAulasMap = new GestionDeAulas(new MapAulaDao());
		
		Aula aula1 = new Aula("Kepler", true, true, puestosDeAlumnos);
		Aula aula2 = new Aula("Salon Java", true, true, puestosDeAlumnos);
		Aula aula3 = new Aula("Salon PHP", true, true, puestosDeAlumnos);
		
		gestionAulasMap.registrarAula(aula1);
		gestionAulasMap.registrarAula(aula2);
		gestionAulasMap.registrarAula(aula3);
		
		System.out.println("-- Lista de Aulas Map--");
		Map<String,Aula> aula = gestionAulasMap.getAula2();
		for(String siguienteAula : aula.keySet()) {
			System.out.println(siguienteAula);
		}
		
		System.out.println();
		gestionAulasMap.eliminarAula("Kepler");
		System.out.println("Aula Eliminada en Map");
		
		System.out.println();
		System.out.println("-- Lista de Aulas Map--");
		Map<String,Aula> aulaMap = gestionAulasMap.getAula2();
		for(String siguienteAula : aulaMap.keySet()) {
			System.out.println(siguienteAula);
		}
		
		Alumno alumno1 = new Alumno("Junior", true);
		Alumno alumno2 = new Alumno("Manuel", true);
		Alumno alumno3 = new Alumno("Juanito", true);
		gestionAulasMap.asignarAlumnoAlAula(alumno1, aula3);
		gestionAulasMap.asignarAlumnoAlAula(alumno2, aula3);
		gestionAulasMap.asignarAlumnoAlAula(alumno3, aula2);
		
		
		System.out.println();
		System.out.println("-- Lista de Alumnos en Salon PHP Map--");
		List<Alumno> alumnos = (List<Alumno>) gestionAulasMap.listaDeAlumnoPorAula("Salon PHP");
		for(Alumno siguienteAlumno : alumnos) {
			System.out.println(siguienteAlumno.getNombre());
		}
	}

}
