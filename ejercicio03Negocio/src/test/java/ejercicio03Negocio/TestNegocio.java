package ejercicio03Negocio;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.curso.java.oo.ejercicio01oo.model.Alumno;
import com.curso.java.oo.ejercicio01oo.model.Aula;
import com.curso.java.oo.ejercicio01oo.model.PuestoDeTrabajo;

public class TestNegocio {

	GestionDeAulas negocioAulas = new GestionDeAulas();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void registrarAulaNegocio() {
		Aula aula = new Aula();
		aula.setNombre("Kepler");
		negocioAulas.registrarAula(aula);

		boolean existeAula = false;
		if (negocioAulas.getAula().size() >= 1) {
			existeAula = true;
		}
		assertTrue("No se registro el aula", existeAula);
	}

	@Test
	public void listaAulasNegocio() {
		Aula aula = new Aula();
		aula.setNombre("Kepler");
		negocioAulas.registrarAula(aula);

		assertFalse("Lista de aulas vacia", negocioAulas.getAula().isEmpty());
	}

	@Test
	public void modificarAulaNegocio() {
		Aula aula = new Aula();
		aula.setNombre("Galileo");
		negocioAulas.registrarAula(aula);
		aula.setNombre("Kepler");
		negocioAulas.modificarAula(aula);

		boolean existeAula = false;
		for (Aula siguienteAula : negocioAulas.getAula()) {
			if (siguienteAula.getNombre().equals("Kepler")) {
				existeAula = true;
				break;
			}
		}
		assertTrue("No Se modifico el aula", existeAula);
	}

	@Test
	public void eliminarAulaNegocio() {
		Aula aula = new Aula();
		aula.setNombre("Galileo");
//		negocioAulas.registrarAula(aula);
		negocioAulas.eliminarAula("Galileo");

		boolean existeAula = false;
		if (negocioAulas.getAula().size() == 0) {
			existeAula = true;
		}
		assertTrue("No Se elimino el aula", existeAula);
	}

	@Test
	public void asignarAlumnosPorAulaNegocio() {
		PuestoDeTrabajo puesto = new PuestoDeTrabajo();
		puesto.setOrdenador(true);

		Aula aula = new Aula();
		aula.setPuestosDeAlumnos(new HashSet<PuestoDeTrabajo>());
		aula.setNombre("Galileo");
		aula.getPuestosDeAlumnos().add(puesto);
		negocioAulas.registrarAula(aula);

		Alumno alumno = new Alumno();
		alumno.setNombre("Junior");

		negocioAulas.asignarAlumnoAlAula(alumno, aula);

		boolean existeAula = false;
		if (negocioAulas.getAula().size() >= 1) {
			existeAula = true;
		}
		assertTrue("Aula vacia", existeAula);
	}

	@Test
	public void listarAlumnosPorAulaNegocio() {
		PuestoDeTrabajo puesto = new PuestoDeTrabajo();
		puesto.setOrdenador(true);

		Aula aula = new Aula();
		aula.setPuestosDeAlumnos(new HashSet<PuestoDeTrabajo>());
		aula.setNombre("Galileo");
		aula.getPuestosDeAlumnos().add(puesto);
		negocioAulas.registrarAula(aula);

		Alumno alumno = new Alumno();
		alumno.setNombre("Junior");

		negocioAulas.asignarAlumnoAlAula(alumno, aula);

		boolean existenAlunmos = false;
		List<Alumno> alumnos = (List<Alumno>) negocioAulas.listaDeAlumnoPorAula("Galileo");
		if (alumnos.size() >= 1) {
			existenAlunmos = true;
		}
		assertTrue("Aula sin alumnos", existenAlunmos);
	}
}
