package ejemplo08;

import javax.persistence.EntityManager;

import util.EMF;

public class Test01 {
	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Circulo c = em.find(Circulo.class, 30);
		if (c != null)
			System.out.println(c);
		
		Rectangulo nuevo = new Rectangulo(1.5, 3.14, 10, 7.2);
		
		em.getTransaction().begin();
		em.persist(nuevo);
		em.getTransaction().commit();
		
		em.close();
	}
}
