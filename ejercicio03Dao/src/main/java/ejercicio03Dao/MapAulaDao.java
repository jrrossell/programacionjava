package ejercicio03Dao;

import java.util.List;
import java.util.Map;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public class MapAulaDao implements IAulaDAO{
	
	private Map<String,Aula> mapaAula;
	
	public void createAula(Aula aula) {
		// TODO Auto-generated method stub
		mapaAula.put(aula.getNombre(), aula);
	}

	public List<Aula> getAula() {
		// TODO Auto-generated method stub
		return (List<Aula>) mapaAula;
	}

	public void updateAula(Aula aula) {
		// TODO Auto-generated method stub
		mapaAula.remove(aula.getNombre());
		mapaAula.put(aula.getNombre(), aula);
		
	}

	public void deleteAula(String aula) {
		// TODO Auto-generated method stub
		mapaAula.remove(aula);
	}

	public Aula getAula(String aula) {
		// TODO Auto-generated method stub
		return mapaAula.get(aula);
	}
	
}
