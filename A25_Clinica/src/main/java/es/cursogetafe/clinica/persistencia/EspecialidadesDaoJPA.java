package es.cursogetafe.clinica.persistencia;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import es.cursogetafe.clinica.modelo.Especialidades;
import es.cursogetafe.clinica.modelo.Medicos;

@Repository
public class EspecialidadesDaoJPA implements EspecialidadesDao{

	@Autowired
	private EntityManagerFactory emf;
	
	private EntityManager em;
	
	@Override
	public void insertarEspecialidad(Especialidades e) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		em.close();			
	}

	@Override
	public Especialidades eliminar(int idEspecialidad) {
		em = emf.createEntityManager();
		Especialidades e = em.find(Especialidades.class, idEspecialidad);
		em.close();
		
		if(e != null) 
			eliminar(e);
		
		return e;
	}

	@Override
	public boolean eliminar(Especialidades e) {
		em = emf.createEntityManager();
		Especialidades buscado = em.find(Especialidades.class, e.getIdEspecialidad());
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
	public void modificar(Especialidades e) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(e);
		em.getTransaction().commit();
		em.close();		
	}

	@Override
	public Set<Especialidades> listarTodas() {
		em = emf.createEntityManager();
		TypedQuery<Especialidades> query = em.createQuery("SELECT e FROM Especialidades e", Especialidades.class);
		Set<Especialidades> resul = new HashSet<Especialidades> (query.getResultList());
		em.close();
		return resul;
	}

	@Override
	public Set<Medicos> medicosPorEspecialidad(Especialidades e) {
		return e.getMedicos();
	}

	@Override
	public Especialidades buscar(int idEspecialidad) {
		em = emf.createEntityManager();
		Especialidades s = em.find(Especialidades.class, idEspecialidad);
		em.close();
		return s;
	}


}
