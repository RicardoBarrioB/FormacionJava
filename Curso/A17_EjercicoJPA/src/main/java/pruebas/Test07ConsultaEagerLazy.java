package pruebas;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import es.cursogetafe.ejerciciojpa.modelo.Cliente;
import util.EMF;

public class Test07ConsultaEagerLazy {

	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		//Buscar 1 cliente con los productos en modo Lazy
		Cliente c = em.find(Cliente.class, 17);
		System.out.println(c.getCategoria());
		
		System.out.println("sigo currando");
		
		System.out.println(c.getProductos().size());
		//close();
		
		//Buscar 1 cliente con los productos en modo Eager
		String jpql = "select c from Cliente c left join fetch c.productos where c.idRol= :id";
		
		TypedQuery<Cliente> q = em.createQuery(jpql, Cliente.class);
		q.setParameter("id", 15);
		Cliente buscado = q.getSingleResult();
		
		System.out.println(buscado);
		
		em.close();
	}

}
