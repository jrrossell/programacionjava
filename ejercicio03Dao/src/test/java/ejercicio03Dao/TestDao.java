package ejercicio03Dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public class TestDao {
	
	ListAulaDao listAulaDao = new ListAulaDao();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetAula() {
		Aula aula = new Aula();
		aula.setNombre("Kepler");
		listAulaDao.createAula(aula);
		assertTrue("Se consiguio el aula", listAulaDao.getAula("Kepler").getNombre().equals("Kepler"));
	}
	
	@Test
	public void testListaAulas() {
		Aula aula = new Aula();
		aula.setNombre("Kepler");
		listAulaDao.createAula(aula);
		assertFalse("Lista de aulas vacia", listAulaDao.getAula().isEmpty());
	}
	
	@Test
	public void crearAula() {
		Aula aula = new Aula();
		aula.setNombre("Galileo");
		listAulaDao.createAula(aula);
		
		boolean existeAula = false;
		if (listAulaDao.getAula().size() >= 1) {
			existeAula = true;
		}
		assertTrue("Se creo el aula", existeAula);
	}
	
	@Test
	public void modificarAula() {
		Aula aula = new Aula();
		aula.setNombre("Galileo");
		listAulaDao.createAula(aula);
		aula.setNombre("Kepler");
		listAulaDao.updateAula(aula);
		
		boolean existeAula = false;
		if (listAulaDao.getAula("Kepler").getNombre() == "Kepler") {
			existeAula = true;
		}
		assertTrue("Se modifico el aula", existeAula);
	}
	
	@Test
	public void eliminarAula() {
		Aula aula = new Aula();
		aula.setNombre("Galileo");
		listAulaDao.deleteAula("Galileo");
		
		boolean existeAula = false;
		if (listAulaDao.getAula().size() == 0) {
			existeAula = true;
		}
		assertTrue("Se elimino el aula", existeAula);
	}

}
