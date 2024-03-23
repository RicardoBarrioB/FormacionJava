package es.cursogetafe.clinica.test;

import javax.persistence.EntityManager;

import es.cursogetafe.clinica.modelo.Especialidades;
import es.cursogetafe.clinica.modelo.Medicos;
import es.cursogetafe.clinica.modelo.Servicios;
import util.EMF;

public class Test_03 {

	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Especialidades esp = em.find(Especialidades.class, 1);
		Servicios ser = em.find(Servicios.class, 1);
		
		Medicos s1 = new Medicos();
		s1.setNombre("Ricardo");
		s1.setApellidos("Barrio");
		s1.setEspecialidad(esp);
		s1.setServicio(ser);
		
		em.getTransaction().begin();
		em.persist(s1);
		em.getTransaction().commit();

		em.close();
		
	}

}
