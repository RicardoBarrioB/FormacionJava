package es.cursogetafe.clinica.test;

import javax.persistence.EntityManager;

import es.cursogetafe.clinica.modelo.Especialidades;
import util.EMF;

public class Test_01 {

	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Especialidades s1 = new Especialidades();
		s1.setNombre("Cardiologia");

		em.getTransaction().begin();
		em.persist(s1);
		em.getTransaction().commit();

		em.close();
		
	}

}
