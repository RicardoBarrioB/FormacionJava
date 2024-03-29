package es.cursogetafe.modelo.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import es.cursogetafe.modelo.excepcion.PasswordIncorrectaException;
import es.cursogetafe.modelo.excepcion.UsuarioInexistenteExcepcion;
import es.cursogetafe.modelo.servlets.Usuario;

public class UsuarioDaoImpl implements UsuarioDao {

	private EntityManager em;
	
	@Override
	public Usuario findById(int id) {
		
		em = EMF.getInstance().createEntityManager();
		Usuario buscado = em.find(Usuario.class, id);
		em.close();
		
		return buscado;
	}

	@Override
	public Usuario valida(String usuario, String password) {
		em = EMF.getInstance().createEntityManager();
		String jpql = "select u from Usuario u where u.usuario = :usr";
		TypedQuery<Usuario> q = em.createQuery(jpql, Usuario.class);
		q.setParameter("usr", usuario);
		Usuario buscado;
		try {
			buscado = q.getSingleResult();
		}catch (NoResultException e) {
			em.close();
			throw new UsuarioInexistenteExcepcion();
		}
		
		if(!buscado.getPassword().equals(password)) {
			em.close();
			throw new PasswordIncorrectaException();
		}	
		em.close();
		return buscado;
	}

	@Override
	public void save(Usuario usuario) {
		em = EMF.getInstance().createEntityManager();
		em.getTransaction().begin();
		em.merge(usuario);
		em.getTransaction().commit();
		em.close();	
	}

}
