package es.cursogetafe.clinica.persistencia;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.cursogetafe.clinica.modelo.Medicos;
import es.cursogetafe.clinica.modelo.Servicios;

@Repository
public class ServiciosDaoJPA implements ServiciosDao{

	@Autowired
	private EntityManagerFactory emf;
	
	private EntityManager em;
	
	@Override
	public void insertarServicio(Servicios s) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();	
	}

	@Override
	public Servicios eliminar(int idServicios) {
		em = emf.createEntityManager();
		Servicios s = em.find(Servicios.class, idServicios);
		em.close();
		
		if(s != null) 
			eliminar(s);
		
		return s;
	}

	@Override
	public boolean eliminar(Servicios s) {
		em = emf.createEntityManager();
		Servicios buscado = em.find(Servicios.class, s.getIdServicio());
		if(buscado != null) {
			em.getTransaction().begin();
			em.remove(buscado);
			em.getTransaction().commit();		
			em.close();
			return true;
		}else {
			em.close();
			return false;
		}
	}

	@Override
	public void modificar(Servicios s) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(s);
		em.getTransaction().commit();
		em.close();			
	}

	@Override
	public Set<Servicios> listarTodos() {
		em = emf.createEntityManager();
		TypedQuery<Servicios> query = em.createQuery("SELECT s FROM Especialidades s", Servicios.class);
		Set<Servicios> resul = new HashSet<Servicios> (query.getResultList());
		em.close();
		return resul;
	}

	@Override
	public Set<Medicos> medicosDelServicio(Servicios s) {
		return s.getMedicosServicio();
	}

	@Override
	public Servicios buscar(int idServicios) {
		em = emf.createEntityManager();
		Servicios s = em.find(Servicios.class, idServicios);
		em.close();
		return s;
	}

	@Override
	public Medicos jefeServicio(Servicios s) {	
		return s.getJefeServicio();
	}



}
