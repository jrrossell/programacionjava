package ejemplo00estructurasDeDatos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class EjemploSet {

	public static void main(String[] args) {
		HashSet<String> miSet = new HashSet<String>();
		miSet.isEmpty();
		miSet.size();
		// [primero]
		miSet.add("primero");
		// [primero,segundo]
		miSet.add("segundo");
		Iterator<String> miIteradorDeCadenas = miSet.iterator();
		miIteradorDeCadenas.hasNext(); // si hay siguiente elemento!
		String cadenaActual = miIteradorDeCadenas.next();
		System.out.println("Devuelve " + cadenaActual);
		cadenaActual = miIteradorDeCadenas.next();
		System.out.println("Devuelve " + cadenaActual);
		Iterator<String> miNuevoIterador = miSet.iterator();
		while (miNuevoIterador.hasNext()) {
			String elementoActual = miNuevoIterador.next();
		}
		// for elemento in lista funciona en iterables
		for (String elemento : miSet) {
			System.out.println(elemento);
		}
		miSet.forEach((miCadenaActual) -> {
			System.out.println(miCadenaActual);
		});
		// Solo funciona en estructuras ordenadas!!
		for(int i = 0;miSet.size() > i; i++) {
			//miSet.get(i);
		}
		//[Otra Cosa,Segundo]
		//miSet.set(0, "Otra cosa");
		//[Otra Cosa,primero,segundo]
		//miSet.add(1, "primero");
		miSet.remove(2);
		boolean contains = miSet.contains("Otra Cosa");
		//int indexOf = miSet.indexOf("primero");
		//String string = miSet.get(1);
		// Solo lo inserta una vez!!!
		miSet.add("manolo");
		miSet.add("manolo");
		miSet.add("manolo");
		miSet.add("manolo");
		miSet.add("manolo");
		miSet.add("manolo");
		miSet.add("manolo");
		miSet.add("manolo");
		
		

	}

}
