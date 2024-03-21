package ejemplo01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import util.EMF;

public class Test02 {

	public static void main(String[] args) {
		EntityManagerFactory emf = EMF.getInstance();
		EntityManager em = emf.createEntityManager();

		Persona01 nuevo = new Persona01();
		nuevo.setApellidos("Vacis");
		nuevo.setNombre("Gerardo");
		nuevo.setApodo("Flaco");
		nuevo.setDni("1234567O");
		
		em.getTransaction().begin();
		
		em.persist(nuevo);
		
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();
	}
}
