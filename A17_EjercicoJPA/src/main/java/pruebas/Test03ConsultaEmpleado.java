package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import es.cursogetafe.ejerciciojpa.modelo.Empleado;
import util.EMF;

public class Test03ConsultaEmpleado {
	
	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		// Todos los empleados
		String jpql = "select e from Empleado e";
		
		//Los empleados de la categoria JEFE SERVICIO
		jpql = "select e from Empleado e where e.categoria.categoria = 'JEFE SERVICIO'";

		//Los empleados de la categoria 2
		jpql = "select e from Empleado e where e.categoria.idCategoria = 2";
		
		//Los empleados de la categoria 4 cuyo apellido es Bustamante
		jpql = "select e from Empleado e "
				+ "where e.categoria.idCategoria = :cat and e.persona.apellidos = :ape";
		
		TypedQuery<Empleado> q = em.createQuery(jpql, Empleado.class);
		q.setParameter("cat", 4);
		q.setParameter("ape", "Bustamante");
		
		List<Empleado> empleados = q.getResultList();
		
		for (Empleado empleado : empleados) {
			System.out.println(empleado);
		}
		
		em.close();
	}
}
