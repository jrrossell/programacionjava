package ejercicio03Dao;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import com.curso.java.oo.ejercicio01oo.model.Aula;

public class ListAulaDao implements IAulaDAO {
	private List<Aula> almacenDeAulas = new ArrayList<Aula>();

	public void createAula(Aula aula) {
		almacenDeAulas.add(aula);
		//System.out.println("Aula registrada");
	}

	public List<Aula> getAula() {
		// TODO Auto-generated method stub
		return almacenDeAulas;
	}

	public void updateAula(Aula aula) {
		// TODO Auto-generated method stub
		for (Aula aulaRecorrer : almacenDeAulas) {
			if (aulaRecorrer.getNombre().equals(aula.getNombre())) {
				almacenDeAulas.remove(aulaRecorrer);
				almacenDeAulas.add(aula);
			}
		}

		/*Iterator<Aula> iteradorAulas = almacenDeAulas.iterator();
		while (iteradorAulas.hasNext()) {
			Aula siguienteAula = iteradorAulas.next();
			if (siguienteAula.getNombre().equals(aula.getNombre())) {
				almacenDeAulas.remove(aula.getNombre());
				almacenDeAulas.add(aula);
			}
		}*/

	}

	public void deleteAula(String nombreDeAula) {
		// TODO Auto-generated method stub
		for (Aula aulaRecorrer : almacenDeAulas) {
			if (aulaRecorrer.getNombre().equals(nombreDeAula)) {
				almacenDeAulas.remove(aulaRecorrer);
			}
		}
	}

	public Aula getAula(String nombreDeAula) {
		// TODO Auto-generated method stub
		for (Aula aulaRecorrer : almacenDeAulas) {
			if (aulaRecorrer.getNombre().equals(nombreDeAula)) {
				return aulaRecorrer;
			}
		}
		return null;
	}

}
