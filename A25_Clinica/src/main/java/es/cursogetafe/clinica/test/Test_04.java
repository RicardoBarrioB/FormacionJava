package es.cursogetafe.clinica.test;

import javax.persistence.EntityManager;

import es.cursogetafe.clinica.modelo.Especialidades;
import es.cursogetafe.clinica.modelo.Medicos;
import es.cursogetafe.clinica.modelo.Servicios;
import util.EMF;

public class Test_04 {

	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Servicios ser = em.find(Servicios.class, 1);
		Medicos med = em.find(Medicos.class, 1);
		ser.setJefeServicio(med);
		
		em.getTransaction().begin();
		em.merge(ser);
		em.getTransaction().commit();

		em.close();
		
	}

}
