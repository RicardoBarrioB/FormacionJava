package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import es.cursogetafe.ejerciciojpa.modelo.Cliente;
import util.EMF;

public class Test02ConsultaCliente {
	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		// Paso 1
		// Crear la consulta JPQL

		// Todos los objetos cliente registrados
//		String jpql = "select c from Cliente c";
		
		// Los clientes cuya categoria sea 'GRAN EMPRESA'
		String categoriaBuscada = "ESPORADICO";
		String jpql = "select c from Cliente c where c.categoria = :cat";
		
		// Paso 2
		// Con el entityManager creamos una Query (TypedQuery)
		// Debemos pasarle como parametros, la jpql y la clase
		TypedQuery<Cliente> q = em.createQuery(jpql, Cliente.class);
		q.setParameter("cat", categoriaBuscada);
		
		// Paso 3
		// Obtenemos el resultado con q.getResultList()
		List<Cliente> clientes = q.getResultList();
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
		
		em.close();
	}
}
