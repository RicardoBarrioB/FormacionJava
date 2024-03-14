package ejemplo06;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import util.EMF;

public class Test01 {
	public static void main(String[] args) {
//		EntityManager em = EMF.getInstance().createEntityManager();
		EntityManagerFactory emf = EMF.getInstance();
		EntityManager em = emf.createEntityManager();
		
		Persona07 p = em.find(Persona07.class, 6);
		if(p != null)
			System.out.println(p);

		em.close();
		EMF.getInstance().close();
	}
}
