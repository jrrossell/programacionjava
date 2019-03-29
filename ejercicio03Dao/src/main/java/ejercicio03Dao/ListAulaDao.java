package ejercicio03Dao;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.curso.java.oo.ejercicio01oo.model.Aula;

@Repository(value = "daoDeAula")
public class ListAulaDao implements IAulaDAO {
	
	public static ApplicationContext context = new ClassPathXmlApplicationContext("beansArray.xml");
	
	private List<Aula> almacenDeAulas = context.getBean("arrayDeAula",List.class);

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
