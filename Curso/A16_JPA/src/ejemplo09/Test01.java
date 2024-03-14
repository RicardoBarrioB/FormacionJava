package ejemplo09;

import javax.persistence.EntityManager;

import util.EMF;

public class Test01 {
	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Rectangulo02 r = em.find(Rectangulo02.class, 66);
		if (r != null)
			System.out.println(r);
		
		Circulo02 nuevo = new Circulo02(1, 2, 3);
		
		em.getTransaction().begin();
		em.persist(nuevo);
		em.getTransaction().commit();
		
		
		em.close();
	}
}
