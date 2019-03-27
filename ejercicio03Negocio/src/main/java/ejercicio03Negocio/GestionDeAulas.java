package ejercicio03Negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.curso.java.oo.ejercicio01oo.model.Aula;
//import com.curso.java.oo.ejercicio01oo.model.Persona;
//import com.curso.java.oo.ejercicio01oo.model.Profesor;
import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

import ejercicio03Dao.IAulaDAO;

public class GestionDeAulas {
	
	private IAulaDAO aulaDao;

	public GestionDeAulas(IAulaDAO aulaDao) {
		super();
		this.aulaDao = aulaDao;
	}

	public void registrarAula(Aula aula) {
		//Aula aula = new Aula(nombre, proyector, pizarra, puestosDeAlumnos);
		aulaDao.createAula(aula);
	}
	
	public List<Aula> getAula() {
		// TODO Auto-generated method stub
		List<Aula> aula = aulaDao.getAula();
		return aula;
		
	}
	
	public Map<String,Aula> getAula2() {
		// TODO Auto-generated method stub
		Map<String,Aula> aula = aulaDao.getAula2();
		return aula;
		
	}
	
	public void modificarAula(Aula aula) {
		// TODO Auto-generated method stub
		aulaDao.updateAula(aula);
	}
	
	public Collection<Alumno> listaDeAlumnoPorAula(String nombreDeAula){
		Collection<Alumno> listaDeAlumnos = new ArrayList<Alumno>();
		// Dame el aula
		Aula aulaQueBusco = aulaDao.getAula(nombreDeAula);
		// Sacar los alumnos
		Set<PuestoDeTrabajo> puestosDeAlumnos = aulaQueBusco.getPuestosDeAlumnos();
		// Recorro el saco
		Iterator<PuestoDeTrabajo> iteradorPuestosDeTrabajo = puestosDeAlumnos.iterator();
		while(iteradorPuestosDeTrabajo.hasNext()) {
			PuestoDeTrabajo siguientePuestoDeTrabajo = iteradorPuestosDeTrabajo.next();
			Alumno alumno = (Alumno) siguientePuestoDeTrabajo.getPersona();
			listaDeAlumnos.add(alumno);
		}
		return listaDeAlumnos;
	}
	
	/*public Collection<Profesor> listaDeProfesorPorAula(String nombreDeAula){
		Collection<Profesor> listaDeProfesores = new ArrayList<Profesor>();
		// Dame el aula
		Aula aulaQueBusco = aulaDao.getAula(nombreDeAula);
		// Sacar los profesores
		PuestoDeTrabajo puestosDeProfesores = aulaQueBusco.getPuestoDelProfesor();
		// Recorro el saco
		Iterator<PuestoDeTrabajo> iteradorPuestosDeTrabajo = puestosDeProfesores.iterator();
		while(iteradorPuestosDeTrabajo.hasNext()) {
			PuestoDeTrabajo siguientePuestoDeTrabajo = iteradorPuestosDeTrabajo.next();
			Profesor profesor = (Profesor) siguientePuestoDeTrabajo.getPersona();
			listaDeProfesores.add(profesor);
		}
		return listaDeProfesores;
	}*/
	
	public void asignarAlumnoAlAula(Alumno alumno, Aula aula) {
		Collection<PuestoDeTrabajo> puestos = aula.getPuestosDeAlumnos();
		Iterator<PuestoDeTrabajo> iterador = puestos.iterator();
		PuestoDeTrabajo puesto;
		while (iterador.hasNext()) {
			puesto = iterador.next();
			if(puesto.getPersona() == null) {
				puesto.setPersona(alumno);
				return;
			}
			
		}

	}
	
	
	public void eliminarAula(String nombreDeAula) {
		aulaDao.deleteAula(nombreDeAula);
	}
	
	
	
	
}
