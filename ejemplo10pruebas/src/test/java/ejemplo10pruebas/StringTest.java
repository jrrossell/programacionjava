package ejemplo10pruebas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.curso.java.ejemplo10pruebas.EjemploDeClaseFuncional;

public class StringTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTextoEnMayusculas() {
		EjemploDeClaseFuncional claseFuncional = new EjemploDeClaseFuncional();
		assertTrue("No devuelve texto en mays!",claseFuncional.textoEnMayusculas("texto").equals("TEXTO"));
	}

}
