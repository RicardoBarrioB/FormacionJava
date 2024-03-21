package maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import agenda.modelo.Contacto;

public class Test01 {
	public static void main(String[] args) {
		Contacto c1 = new Contacto("Maria");
		c1.setIdContacto(1);
		Contacto c2 = new Contacto("Daniel");
		c2.setIdContacto(15);
		Contacto c3 = new Contacto("Pedro");
		c3.setIdContacto(50);
		Contacto c4 = new Contacto("Susana");
		c4.setIdContacto(10);
		
		//en un array
		Contacto[] contactosAy = {c1, c2, c3, c4};
		
		//en una Lista
		List<Contacto> contactosLst = Arrays.asList(contactosAy);
		
		//en un TreeSet
		Set<Contacto> contactosTree = new TreeSet<Contacto>(contactosLst);
		
		//en un HashSet
		Set<Contacto> contactosHash = new HashSet<>(contactosLst);
		
		//Buscar el contacto con id = 50
		
		Map<Integer, Contacto> map1 = new HashMap<>();
		
		map1.put(c1.getIdContacto(), c1);
		map1.put(c2.getIdContacto(), c2);
		map1.put(c3.getIdContacto(), c3);
		map1.put(c4.getIdContacto(), c4);
		
		for (Integer key : map1.keySet()) {
			System.out.println(key);
		}
		
		for (Contacto con : map1.values()) {
			System.out.println(con);
		}
		
		for (Integer key : map1.keySet()) {
			System.out.println("(" + key + "," + map1.get(key));
		}
		
		for(Entry<Integer, Contacto> entry : map1.entrySet()) {
			System.out.println("(" + entry.getKey() + "," + entry.getValue());
		}
		
		
		Contacto buscado = map1.get(50);
		
		Map<Integer, Contacto> map2 = new HashMap<>();		
		
		contactosLst.forEach(Contacto -> map2.put(Contacto.getIdContacto(), Contacto));
		
		for (Integer key : map2.keySet()) {
			System.out.println(key);
		}
		for (Contacto con : map2.values()) {
			System.out.println(con);
		}
	}
}







