package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import es.cursogetafe.ejerciciojpa.modelo.Cliente;
import util.EMF;

public class Test05ConsultaFetch {
	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		//con join fetch forzamos la carga de los lazy
		String jpql = "select c from Cliente c left join fetch c.productos";
		
		TypedQuery<Cliente> q= em.createQuery(jpql, Cliente.class);
		List<Cliente> clis = q.getResultList();
		
		em.close();
		
		System.out.println("=========================");
		
		for (Cliente cli : clis) {
			System.out.println(cli);
			System.out.println(cli.getProductos());
		}
	}
}
