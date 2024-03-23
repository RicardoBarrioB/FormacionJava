package es.cursogetafe.clinica.persistencia;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.cursogetafe.clinica.modelo.Medicos;

@Repository
public class MedicosDaoJPA implements MedicosDao {
	
	@Autowired
	private EntityManagerFactory emf;
	
	private EntityManager em;

	@Override
	public void insertarMedico(Medicos m) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(m);
		em.getTransaction().commit();
		em.close();	
	}

	@Override
	public Medicos eliminar(int idMedico) {
		em = emf.createEntityManager();
		Medicos m = em.find(Medicos.class, idMedico);
		em.close();
		
		if(m != null) 
			eliminar(m);
		
		return m;
	}

	@Override
	public boolean eliminar(Medicos m) {
		em = emf.createEntityManager();
		Medicos buscado = em.find(Medicos.class, m.getIdMedico());
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
	public void modificar(Medicos m) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(m);
		em.getTransaction().commit();
		em.close();		
	}

	@Override
	public Set<Medicos> buscarTodos() {
		em = emf.createEntityManager();
		TypedQuery<Medicos> query = em.createQuery("SELECT m FROM Especialidades m", Medicos.class);
		Set<Medicos> resul = new HashSet<Medicos> (query.getResultList());
		em.close();
		return resul;
	}

	@Override
	public Set<Medicos> buscarMedicos(String cadena) {
		em = emf.createEntityManager();
		TypedQuery<Medicos> query = em.createQuery("SELECT m FROM Especialidades m where c.nombre like : cadena or c.apellidos like :cadena", Medicos.class);
		query.setParameter("cadena", "%" + cadena + "%");
		Set<Medicos> resul = new HashSet<Medicos> (query.getResultList());
		em.close();
		return resul;
	}

	@Override
	public Medicos buscar(int idMedico) {
		em = emf.createEntityManager();
		Medicos m = em.find(Medicos.class, idMedico);
		em.close();
		return m;
	}
	
}




