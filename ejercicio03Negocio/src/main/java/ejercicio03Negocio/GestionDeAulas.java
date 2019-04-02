package ejercicio03Negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.java.oo.ejercicio01oo.model.Aula;
//import com.curso.java.oo.ejercicio01oo.model.Persona;
//import com.curso.java.oo.ejercicio01oo.model.Profesor;
import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

import ejercicio03Dao.IAulaDAO;
import ejercicio03Dao.ListAulaDao;

@Service(value = "daoDeNegocio")
public class GestionDeAulas {
	
	@Autowired
	private IAulaDAO aulaDao = new ListAulaDao();

	public IAulaDAO getAulaDao() {
		return aulaDao;
	}

	public void setAulaDao(IAulaDAO aulaDao) {
		this.aulaDao = aulaDao;
	}

	public void registrarAula(Aula aula) {
		aulaDao.createAula(aula);
	}
	
	public List<Aula> getAula() {
		List<Aula> aula = aulaDao.getAula();
		return aula;
		
	}
	
	public void modificarAula(Aula aula) {
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
