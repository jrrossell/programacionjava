package ejemplo00estructurasDeDatos;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploLista {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.isEmpty();
		lista.size();
		// [primero]
		lista.add("primero");
		// [primero,segundo]
		lista.add("segundo");
		Iterator<String> miIteradorDeCadenas = lista.iterator();
		miIteradorDeCadenas.hasNext(); // si hay siguiente elemento!
		String cadenaActual = miIteradorDeCadenas.next();
		System.out.println("Devuelve " + cadenaActual);
		cadenaActual = miIteradorDeCadenas.next();
		System.out.println("Devuelve " + cadenaActual);
		Iterator<String> miNuevoIterador = lista.iterator();
		while (miNuevoIterador.hasNext()) {
			String elementoActual = miNuevoIterador.next();
		}
		// for elemento in lista funciona en iterables
		for (String elemento : lista) {
			System.out.println(elemento);
		}
		lista.forEach((miCadenaActual) -> {
			System.out.println(miCadenaActual);
		});
		for(int i = 0;lista.size() > i; i++) {
			lista.get(i);
		}
		//[Otra Cosa,Segundo]
		lista.set(0, "Otra cosa");
		//[Otra Cosa,primero,segundo]
		lista.add(1, "primero");
		lista.remove(2);
		boolean contains = lista.contains("Otra Cosa");
		int indexOf = lista.indexOf("primero");
		String string = lista.get(1);
		

	}

}
