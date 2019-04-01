package ejemplo06anotaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ejemplo06anotaciones.modelo.Director;
import ejemplo06anotaciones.modelo.Pelicula;
import ejemplo06anotaciones.negocio.NegocioPelis;

public class LanzadorSpring {
	public static ApplicationContext context;

	static {
		context = new AnnotationConfigApplicationContext(ConfiguracionDeSpring.class);
	}

	public static void main(String[] args) {
		Pelicula peli = context.getBean(Pelicula.class);
		Director dire = context.getBean(Director.class);
		System.out.println(peli);
		System.out.println(dire);

		NegocioPelis negocio = context.getBean("negocioPelis", NegocioPelis.class);
		System.out.println(negocio.guardala(peli));
		System.out.println(negocio.aVerLoQueTengo());
	}
}
