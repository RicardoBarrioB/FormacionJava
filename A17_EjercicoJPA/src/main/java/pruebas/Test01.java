package pruebas;

import javax.persistence.EntityManager;

import es.cursogetafe.ejerciciojpa.modelo.Cliente;
import es.cursogetafe.ejerciciojpa.modelo.Colaborador;
import es.cursogetafe.ejerciciojpa.modelo.Empleado;
import es.cursogetafe.ejerciciojpa.modelo.Persona;
import util.EMF;

public class Test01 {
	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Persona p = em.find(Persona.class, 5);
		
		System.out.println(p);
		
		
		Colaborador c = em.find(Colaborador.class, 8);
		System.out.println(c);
		System.out.println(c.getApellidos());
		
		Empleado e = em.find(Empleado.class, 10);
		System.out.println(e);
		
		Cliente cli = em.find(Cliente.class, 6);
		System.out.println(cli);
		System.out.println(cli.getProductos());
		
		em.close();
	}
}
