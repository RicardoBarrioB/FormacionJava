package pruebas;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import es.cursogetafe.ejerciciojpa.modelo.Cliente;
import util.EMF;

public class Test04ConsultaClientesProductos {

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		//Todos los clientes
		String jpql = "select c from Cliente c";
		
		//Los clientes que han comprado algun producto con precio mayor a 500
		jpql = "select c from Cliente c join c.productos p where p.precio > :precio";
		
		TypedQuery<Cliente> q = em.createQuery(jpql, Cliente.class);
		q.setParameter("precio", 500.);
		
		//Los clientes que han comprado algun disco
		jpql = "select c from Cliente c join c.productos p where p.producto like :prod";
		q = em.createQuery(jpql, Cliente.class);
		q.setParameter("prod", "%disco%");
		
		List<Cliente> clis = q.getResultList();
		
		for (Cliente cliente : clis) {
			System.out.println(cliente);
			System.out.println(cliente.getProductos());
		}
		
		em.close();
	}
}
