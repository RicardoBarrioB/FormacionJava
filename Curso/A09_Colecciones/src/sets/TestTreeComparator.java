package sets;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import agenda.modelo.Contacto;

public class TestTreeComparator {
	public static void main(String[] args) {
		
		Contacto c1 = new Contacto("M");
		c1.setIdContacto(1);
		Contacto c2 = new Contacto("D");
		c2.setIdContacto(15);
		Contacto c3 = new Contacto("P");
		c3.setIdContacto(50);
		Contacto c4 = new Contacto("S");
		c4.setIdContacto(10);	
		
		Set<Contacto> contactos = new TreeSet<>();
		contactos.add(c1);
		contactos.add(c2);
		contactos.add(c3);
		contactos.add(c4);
		
		for (Contacto contacto : contactos) {
			System.out.println(contacto);
		}
		
		System.out.println("-----------------------------------");
		
		Set<Contacto> contactosComp = new TreeSet<>(new ContactoIdComparator());
		contactosComp.addAll(contactos);
		
		for (Contacto contacto : contactosComp) {
			System.out.println(contacto);
		}
		
		System.out.println("-----------------------------------");
		
		Set<Contacto> contactosComp2 = new TreeSet<Contacto>(new Comparator<Contacto>() {
			@Override
			public int compare(Contacto c1, Contacto c2) {
				return c1.getIdContacto() - c2.getIdContacto();
			}
		});
		
		contactosComp2.addAll(contactos);
		
		System.out.println("Orden con Comparator Clase anónima (id):");
		for (Contacto contacto : contactosComp2) {
			System.out.println(contacto);
		}
		
		System.out.println("------------------------");
		
		
		// 3 - Comparator desde un metodo estático de contacto
		
		Set<Contacto> contactosComp3 = new TreeSet<Contacto>(Contacto.getIdComparator());
		
		contactosComp3.addAll(contactos);
		contactosComp3.forEach(System.out::println);
		
		System.out.println("------------------------");
		
		
		//Opcion 4:
		
		Set<Contacto> contactosComp4 = new TreeSet<Contacto>(Contacto::compare);
		
		System.out.println("Programacion funcional:");
		contactosComp4.addAll(contactos);
		contactosComp4.forEach(System.out::println);
		
		System.out.println("------------------------");
		
		//Opcion 5: 
		
		Set<Contacto> contactosComp5 = new TreeSet<Contacto>((con1, con2) -> con1.getIdContacto() - con2.getIdContacto());
		
		System.out.println("Programacion funcional(lambda):");
		contactosComp5.addAll(contactos);
		contactosComp5.forEach(System.out::println);
		
		
		System.out.println("Prueba ArrayList add: ");
		List<Contacto> prueba = new ArrayList<>();
		
		prueba.forEach(contactosComp5::add);
		
		prueba.forEach(System.out::println);
	}
}














