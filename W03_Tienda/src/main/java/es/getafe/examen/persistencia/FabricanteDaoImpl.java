package es.getafe.examen.persistencia;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import es.getafe.examen.modelo.Fabricante;

public class FabricanteDaoImpl implements FabricanteDao{

	private EntityManager em;
	
	@Override
	public void save(Fabricante fabricante) {
		em = EMF.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		em.merge(fabricante);
		em.getTransaction().commit();	
		
		em.close();
	}

	@Override
	public Fabricante findByIdLazy(int idFabricante) {		
		em = EMF.getInstance().createEntityManager();
		Fabricante fabricante = em.find(Fabricante.class, idFabricante);
		em.close();
		return fabricante;
	}

	@Override
	public Fabricante findById(int idFabricante) {
		em = EMF.getInstance().createEntityManager();
		String jpql = "select f from Fabricante f "
				+ "left join fetch f.productos "
				+ "where f.idFabricante = :id";
		TypedQuery<Fabricante> q = em.createQuery(jpql, Fabricante.class);
		q.setParameter("id", idFabricante);
		Fabricante buscado;
		try {
			buscado = q.getSingleResult();
		}catch (NoResultException e) {
			buscado =  null;
		}
		
		em.close();
	
		return buscado;
	}

	@Override
	public Set<Fabricante> findOnlyActive() {
		
		em = EMF.getInstance().createEntityManager();
		String jpql = "select f from Fabricante f join f.productos";
		TypedQuery<Fabricante> q = em.createQuery(jpql, Fabricante.class);
		Set<Fabricante>todos;
		todos = new HashSet<Fabricante>(q.getResultList());
		
		return todos;
	}

	@Override
	public Set<Fabricante> findAll() {
		em = EMF.getInstance().createEntityManager();
		String jpql = "select f from Fabricante f";
		TypedQuery<Fabricante> q = em.createQuery(jpql, Fabricante.class);
		Set<Fabricante>todos;
		todos = new HashSet<Fabricante>(q.getResultList());
		
		em.close();
		
		return todos;
	}

}
