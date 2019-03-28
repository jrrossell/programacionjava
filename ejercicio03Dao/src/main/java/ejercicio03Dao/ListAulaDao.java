package ejercicio03Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public class ListAulaDao implements IAulaDAO {
	
	public static ApplicationContext context = new ClassPathXmlApplicationContext("beansDao.xml");
	
	private List<Aula> almacenDeAulas = new ArrayList<Aula>();

	public void createAula(Aula aula) {
		almacenDeAulas.add(aula);
	}

	public List<Aula> getAula() {
		return almacenDeAulas;
	}

	public void updateAula(Aula aula) {
		for (Aula aulaRecorrer : almacenDeAulas) {
			if (aulaRecorrer.getNombre().equals(aula.getNombre())) {
				almacenDeAulas.remove(aulaRecorrer);
				almacenDeAulas.add(aula);
			}
		}
	}

	public void deleteAula(String nombreDeAula) {
		for (Aula aulaRecorrer : almacenDeAulas) {
			if (aulaRecorrer.getNombre().equals(nombreDeAula)) {
				almacenDeAulas.remove(aulaRecorrer);
			}
		}
	}

	public Aula getAula(String nombreDeAula) {
		for (Aula aulaRecorrer : almacenDeAulas) {
			if (aulaRecorrer.getNombre().equals(nombreDeAula)) {
				return aulaRecorrer;
			}
		}
		return null;
	}

}
