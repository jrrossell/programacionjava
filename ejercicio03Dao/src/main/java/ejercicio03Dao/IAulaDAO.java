package ejercicio03Dao;

import java.util.List;

import com.curso.java.oo.ejercicio01oo.model.Aula;

public interface IAulaDAO {
	void createAula(Aula aula);
	List<Aula> getAula();
	void updateAula(Aula aula);
	void deleteAula(String isbn);
	Aula getAula(String isbn);
}
