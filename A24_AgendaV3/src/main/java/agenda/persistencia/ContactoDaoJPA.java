package agenda.persistencia;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import agenda.modelo.Contacto;

@Repository
public class ContactoDaoJPA implements ContactoDao{
	
	@Autowired
	private EntityManagerFactory emf;
	
	private EntityManager em;
	
	@Override
	public void insertar(Contacto c) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void actualizar(Contacto c) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(c);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public boolean eliminar(int idContacto) {
		em = emf.createEntityManager();
		Contacto c = em.find(Contacto.class, idContacto);
		em.close();
		if(c != null) {	
			return eliminar(c);
		}else {
			return false;
		}	
	}

	@Override
	public boolean eliminar(Contacto c) {
		em = emf.createEntityManager();
		Contacto buscado = em.find(Contacto.class, c.getIdContacto());
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
	public Contacto buscar(int idContacto) {
		em = emf.createEntityManager();
		String jpql = "select c from Contacto c "
				+ "left join fetch c.telefonos "
				+ "left join fetch c.correos "
				+ "where c.idContacto = :id";
		TypedQuery<Contacto> q = em.createQuery(jpql, Contacto.class);
		q.setParameter("id", idContacto);
		Contacto buscado;
		try{
			buscado = q.getSingleResult();
		}catch (NoResultException e) {
			buscado = null;
		}finally {
			em.close();
		}
		
		return buscado;
	}

	@Override
	public Set<Contacto> buscar(String cadena) {
		em = emf.createEntityManager();
		String jpql = "select c from Contacto c "
				+ "where c.nombre like : cadena "
				+ "or c.apellidos like :cadena "
				+ "or c.apodo like :cadena";
		TypedQuery<Contacto> q = em.createQuery(jpql, Contacto.class);
		q.setParameter("cadena", "%" + cadena + "%");
		Set<Contacto> todos = new HashSet<>(q.getResultList());
		em.close();
		return todos;
	}

	@Override
	public Set<Contacto> buscarTodos() {
		em = emf.createEntityManager();
		String jpql = "select c from Contacto c ";
		TypedQuery<Contacto> q = em.createQuery(jpql, Contacto.class);
		Set<Contacto> todos = new HashSet<>(q.getResultList());
		em.close();
		return todos;
	}
	
}










