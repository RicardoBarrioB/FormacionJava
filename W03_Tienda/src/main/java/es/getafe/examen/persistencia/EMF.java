package es.getafe.examen.persistencia;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {

private static EntityManagerFactory emf;
	
	private EMF() {}
	
	public static EntityManagerFactory getInstance() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("tienda");
		}
		return emf;
	}

}
