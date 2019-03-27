package ejercicio03Dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public class MapAulaDao implements IAulaDAO{
	
	private Map<String,Aula> mapaAula = new HashMap<String, Aula>();
	
	public void createAula(Aula aula) {
		// TODO Auto-generated method stub
		mapaAula.put(aula.getNombre(), aula);
	}

	public Map<String,Aula> getAula2() {
		// TODO Auto-generated method stub
		return mapaAula;
	}

	public void updateAula(Aula aula) {
		// TODO Auto-generated method stub
		mapaAula.remove(aula.getNombre());
		mapaAula.put(aula.getNombre(), aula);
		
	}

	public void deleteAula(String nombreAula) {
		// TODO Auto-generated method stub
		mapaAula.remove(nombreAula);
	}

	public Aula getAula(String nombreAula) {
		// TODO Auto-generated method stub
		return mapaAula.get(nombreAula);
	}

	public List<Aula> getAula() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
