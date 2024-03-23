package es.cursogetafe.clinica.test;

import javax.persistence.EntityManager;

import es.cursogetafe.clinica.modelo.Especialidades;
import es.cursogetafe.clinica.modelo.Servicios;
import util.EMF;

public class Test_02 {

	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Servicios s1 = new Servicios();
		s1.setNombreServicio("Consultas externas");

		em.getTransaction().begin();
		em.persist(s1);
		em.getTransaction().commit();

		em.close();
		
	}

}
