package ejemplo07;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import util.EMF;

public class Test01 {
	public static void main(String[] args) {
//		EntityManager em = EMF.getInstance().createEntityManager();
		EntityManagerFactory emf = EMF.getInstance();
		EntityManager em = emf.createEntityManager();
		
		Persona08 p = em.find(Persona08.class, 6);
		if(p != null)
			System.out.println(p);
		
		p.setApodo("Cachirulo");
		// no me interesa
		//sigo currando
		
		Persona08 nuevo = new Persona08();
		nuevo.setNombre("Federica");
		nuevo.setApodo("Fede");
		nuevo.setApellidos("Lopez");
		
		em.persist(nuevo);
		
		em.close();
		EMF.getInstance().close();
	}
}
