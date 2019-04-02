package com.curso.java.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
//import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

import ejercicio03Negocio.GestionDeAulas;

/**
 * Servlet implementation class EjemploServlet
 */
@WebServlet({ "/alumnos" })
public class EjemploServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private ApplicationContext context;
	
	@Override
	public void init() throws ServletException {
		
		ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		this.context = applicationContext;
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EjemploServlet() {
		super();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		request.setAttribute("mensajeSingleton", context.getBean("mensajeSingleton"));
//		request.setAttribute("mensajePrototype", context.getBean("mensajePrototype"));
//		request.setAttribute("mensajeRequest", context.getBean("mensajeRequest"));
//		request.setAttribute("mensajeSession", context.getBean("mensajeSession"));

		PuestoDeTrabajo puesto1 = context.getBean(PuestoDeTrabajo.class);
		puesto1.setOrdenador(true);
		PuestoDeTrabajo puesto2 = context.getBean(PuestoDeTrabajo.class);
		puesto2.setOrdenador(true);
		PuestoDeTrabajo puesto3 = context.getBean(PuestoDeTrabajo.class);
		puesto3.setOrdenador(true);
		PuestoDeTrabajo puesto4 = context.getBean(PuestoDeTrabajo.class);
		puesto4.setOrdenador(true);
		PuestoDeTrabajo puesto5 = context.getBean(PuestoDeTrabajo.class);
		puesto4.setOrdenador(true);
		
		//Bean del Negocio
		GestionDeAulas gestionAulas = (GestionDeAulas) context.getBean("daoDeNegocio");

		Aula aula1 = context.getBean(Aula.class);
		aula1.setNombre("kepler");
		aula1.getPuestosDeAlumnos().add(puesto1);
		aula1.getPuestosDeAlumnos().add(puesto2);
		aula1.getPuestosDeAlumnos().add(puesto3);
		aula1.getPuestosDeAlumnos().add(puesto4);
		gestionAulas.registrarAula(aula1);
		
		Aula aula2 = context.getBean(Aula.class);
		aula2.setNombre("Galileo");
		aula2.getPuestosDeAlumnos().add(puesto1);
		aula2.getPuestosDeAlumnos().add(puesto2);
		aula2.getPuestosDeAlumnos().add(puesto3);
		aula2.getPuestosDeAlumnos().add(puesto4);
		aula2.getPuestosDeAlumnos().add(puesto5);
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

		Alumno alumno1 = context.getBean(Alumno.class);
		alumno1.setNombre("Junior");
		Alumno alumno2 = context.getBean(Alumno.class);
		alumno2.setNombre("Manuel");
		Alumno alumno3 = context.getBean(Alumno.class);
		alumno3.setNombre("Jose");
		Alumno alumno4 = context.getBean(Alumno.class);
		alumno4.setNombre("Pepe");
		Alumno alumno5 = context.getBean(Alumno.class);
		alumno5.setNombre("Maria");
		
		gestionAulas.asignarAlumnoAlAula(alumno1, aula2);
		gestionAulas.asignarAlumnoAlAula(alumno2, aula2);
		gestionAulas.asignarAlumnoAlAula(alumno3, aula2);
		gestionAulas.asignarAlumnoAlAula(alumno4, aula2);
		gestionAulas.asignarAlumnoAlAula(alumno5, aula2);
		
		System.out.println();
		System.out.println("-- Lista de Alumnos en sala Galileo --");
		List<Alumno> alumnos = (List<Alumno>) gestionAulas.listaDeAlumnoPorAula("Galileo");
//		request.setAttribute("listaDeAlumnos", alumnos);
		int i = 0;
		for(Alumno siguienteAlumno : alumnos) {
			System.out.println(siguienteAlumno);
			i++;
			request.setAttribute("alumno" + i, siguienteAlumno.getNombre());
			
		}
		
		request.setAttribute("nombreAula", aula2.getNombre());
		request.setAttribute("cantidadAlumos", i);
		getServletContext().getRequestDispatcher("/WEB-INF/jsps/saludar.jsp").forward(request, response);
	}

}
