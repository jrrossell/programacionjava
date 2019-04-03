package ejemplo00estructurasDeDatos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class EjemploMap {

	public static void main(String[] args) {
		HashMap<Integer,String> miMap = new HashMap<Integer,String>();
		miMap.isEmpty();
		miMap.size();
		// [primero]
		miMap.put(1,"primero");
		// [primero,segundo]
		miMap.put(2,"segundo");
		Iterator<Integer> miIteradorDeCadenas = miMap.keySet().iterator();
		miIteradorDeCadenas.hasNext(); // si hay siguiente elemento!
		Integer cadenaActual = miIteradorDeCadenas.next();
		System.out.println("Devuelve " + cadenaActual);
		cadenaActual = miIteradorDeCadenas.next();
		System.out.println("Devuelve " + cadenaActual);
		Iterator<Integer> miNuevoIterador = miMap.keySet().iterator();
		while (miNuevoIterador.hasNext()) {
			Integer clave = miNuevoIterador.next();
			String valor = miMap.get(clave);
			System.out.println("K:" + clave + " V:" + valor);
		}
		// for elemento in lista funciona en iterables
		for (Integer elemento : miMap.keySet()) {
			System.out.println(elemento);
		}
		miMap.forEach((miClave,miValor) -> {
			System.out.println("K:" + miClave + " V:" + miValor);
		});
		// Solo funciona en estructuras ordenadas!!
		for(int i = 0;miMap.size() > i; i++) {
			//miSet.get(i);
		}
		//[Otra Cosa,Segundo]
		miMap.put(1, "Otra cosa");
		//[Otra Cosa,primero,segundo]
		miMap.put(99, "primero");
		String valor = miMap.remove(2);
		boolean contains = miMap.containsKey(1);
		boolean containsValue = miMap.containsValue("primero");
		//int indexOf = miSet.indexOf("primero");
		String string = miMap.get(1);
		// Pisa el contenido de k 1 todas las veces
		miMap.put(1,"manolo");
		miMap.put(1,"manolo");
		miMap.put(1,"manolo");
		miMap.put(1,"manolo");
		miMap.put(1,"manolo");
		miMap.put(1,"manolo");
		

	}

}
