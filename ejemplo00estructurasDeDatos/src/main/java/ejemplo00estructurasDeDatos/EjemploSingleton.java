package ejemplo00estructurasDeDatos;

public class EjemploSingleton {
	private static EjemploSingleton instance;
	private EjemploSingleton() {
		
	}
	public static EjemploSingleton getInstance() {
		if(instance == null) {
			instance = new EjemploSingleton();
		}
		return instance;
	}
}
