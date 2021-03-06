package ejercicio03Lanzador;

//import java.util.HashSet;
import java.util.List;
//import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

import ejercicio03Negocio.GestionDeAulas;

public class LanzadorAulas {

	public static ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	public static void main(String[] args) {
		
		//Set<PuestoDeTrabajo> puestosDeAlumnos = new HashSet<PuestoDeTrabajo>();
		
//		PuestoDeTrabajo puesto = new PuestoDeTrabajo(true);
//		PuestoDeTrabajo puesto1 = new PuestoDeTrabajo(true);
//		PuestoDeTrabajo puesto2 = new PuestoDeTrabajo(true);
//		PuestoDeTrabajo puesto3 = new PuestoDeTrabajo(true);
		
		PuestoDeTrabajo puesto1 = context.getBean(PuestoDeTrabajo.class);
		puesto1.setOrdenador(true);
		PuestoDeTrabajo puesto2 = context.getBean(PuestoDeTrabajo.class);
		puesto2.setOrdenador(true);
		PuestoDeTrabajo puesto3 = context.getBean(PuestoDeTrabajo.class);
		puesto3.setOrdenador(true);
		PuestoDeTrabajo puesto4 = context.getBean(PuestoDeTrabajo.class);
		puesto4.setOrdenador(true);

		//Bean del DAO
		//IAulaDAO daoDeAula = context.getBean("daoDeAula", IAulaDAO.class);
		
		//Bean del Negocio
		GestionDeAulas gestionAulas = (GestionDeAulas) context.getBean("daoDeNegocio");
		//gestionAulas.setAulaDao(daoDeAula);
		
		//Aula aula1 = new Aula("Kepler", true, true, puestosDeAlumnos);
		//Aula aula2 = new Aula("Sala Java", true, true, puestosDeAlumnos);
		//Aula aula3 = new Aula("Salon Nuevo", true, true, puestosDeAlumnos);
		Aula aula1 = context.getBean(Aula.class);
		aula1.setNombre("kepler");
		aula1.getPuestosDeAlumnos().add(puesto1);
		aula1.getPuestosDeAlumnos().add(puesto2);
		aula1.getPuestosDeAlumnos().add(puesto3);
		aula1.getPuestosDeAlumnos().add(puesto4);
		gestionAulas.registrarAula(aula1);
		
		Aula aula2 = context.getBean(Aula.class);
		aula2.setNombre("Sala Java");
		aula2.getPuestosDeAlumnos().add(puesto1);
		aula2.getPuestosDeAlumnos().add(puesto2);
		aula2.getPuestosDeAlumnos().add(puesto3);
		aula2.getPuestosDeAlumnos().add(puesto4);
		gestionAulas.registrarAula(aula2);
		//gestionAulas.registrarAula(aula3);
		
		System.out.println("-- Lista de Aulas --");
		List<Aula> aula = gestionAulas.getAula();
		for(Aula siguienteAula : aula) {
			System.out.println(siguienteAula);
		}
		
		System.out.println();
		gestionAulas.eliminarAula("kepler");
		System.out.println("Aula Eliminada ");
		
		System.out.println();
		System.out.println("-- Lista de Aulas --");
		List<Aula> aulaList = gestionAulas.getAula();
		for(Aula siguienteAula : aulaList) {
			System.out.println(siguienteAula);
		}
		
		//Alumno alumno1 = new Alumno("Junior", true);
		//Alumno alumno2 = new Alumno("Manuel", true);
		//Alumno alumno3 = new Alumno("Jose", true);
		//Alumno alumno4 = new Alumno("Pepe", true);
		
		Alumno alumno1 = context.getBean(Alumno.class);
		alumno1.setNombre("Junior");
		Alumno alumno2 = context.getBean(Alumno.class);
		alumno2.setNombre("Manuel");
		Alumno alumno3 = context.getBean(Alumno.class);
		alumno3.setNombre("Jose");
		Alumno alumno4 = context.getBean(Alumno.class);
		alumno4.setNombre("Pepe");
		
		gestionAulas.asignarAlumnoAlAula(alumno1, aula2);
		gestionAulas.asignarAlumnoAlAula(alumno2, aula2);
		gestionAulas.asignarAlumnoAlAula(alumno3, aula2);
		gestionAulas.asignarAlumnoAlAula(alumno4, aula2);
		
		System.out.println();
		System.out.println("-- Lista de Alumnos en Salon Java --");
		List<Alumno> alumnos = (List<Alumno>) gestionAulas.listaDeAlumnoPorAula("Sala Java");
		for(Alumno siguienteAlumno : alumnos) {
			System.out.println(siguienteAlumno);
		}
	}

}
