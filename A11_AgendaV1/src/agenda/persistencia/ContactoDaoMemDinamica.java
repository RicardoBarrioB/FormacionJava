package agenda.persistencia;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import agenda.modelo.Contacto;

public class ContactoDaoMemDinamica implements ContactoDao {

	private Map<Integer, Contacto> almacen;
	private int proximoId;
	
	public ContactoDaoMemDinamica() {
		almacen = new HashMap<>();
		proximoId = 1;
	}
	
	//Generar el id
	//Añadir un elemento en el map
	@Override
	public void insertar(Contacto c) {
		c.setIdContacto(proximoId++);
		almacen.put(c.getIdContacto(), c);
	}

	@Override
	public void actualizar(Contacto c) {
		almacen.replace(c.getIdContacto(), c);
	}

	// retorna false si el contacto no existe
	@Override
	public boolean eliminar(int idContacto) {
		return almacen.remove(idContacto) != null;
	}

	@Override
	public boolean eliminar(Contacto c) {
		return eliminar(c.getIdContacto());
	}

	@Override
	public Contacto buscar(int idContacto) {
		return almacen.get(idContacto);
	}

	@Override
	public Set<Contacto> buscar(String cadena) {
		Set<Contacto> contactos = new HashSet<>();
		String c = cadena.toLowerCase();
		
		Predicate<Contacto> pred = Contacto -> Contacto.getNombre().toLowerCase().contains(cadena) || Contacto.getApellidos().toLowerCase().contains(cadena) || Contacto.getApodo().toLowerCase().contains(cadena);
				
		almacen.values().stream().filter(pred).forEach(contactos::add);
		
	/*	for(Contacto contacto : almacen.values()) {
			if(contacto.getNombre().toLowerCase().contains(cadena) || contacto.getApellidos().toLowerCase().contains(cadena) || contacto.getApodo().toLowerCase().contains(cadena)) {
				contactos.add(contacto);
			}
		}*/
		return contactos;
	}

	@Override
	public Set<Contacto> buscarTodos() {
		return new HashSet<Contacto>(almacen.values());
	}

}
