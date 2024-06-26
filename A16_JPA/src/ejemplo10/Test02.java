package ejemplo10;

import javax.persistence.EntityManager;

import util.EMF;

public class Test02 {
	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Contacto02 c = em.find(Contacto02.class, 7);
		
		if (c != null)
			System.out.println(c);
		
		Domicilio02 d = em.find(Domicilio02.class, 2);
		if (d != null) {
			System.out.println(d);
			System.out.println(d.getContacto());
		}
		
		em.close();
	}
}
