package agenda.persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import agenda.modelo.Contacto;

public class ContactoDaoMemSerial implements ContactoDao {

	private Map<Integer, Contacto> almacen;
	private Integer proximoId;
	private final String F_MAPA = "mapa.dat";
	private final String F_IDX = "indice.bat";
	
	public ContactoDaoMemSerial() {
		
		try(FileInputStream fis = new FileInputStream(F_MAPA);
			FileInputStream fisIdx = new FileInputStream(F_IDX)){
			ObjectInputStream ois = new ObjectInputStream(fis);
			almacen = (Map<Integer, Contacto>) ois.readObject();
			ois = new ObjectInputStream(fisIdx);
			proximoId = (Integer) ois.readObject();
			
			} catch (FileNotFoundException e) {
			almacen = new HashMap<>();
			proximoId = 1;
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	private void grabar() {
		try(FileOutputStream fos = new FileOutputStream(F_MAPA);
			FileOutputStream fosIdx = new FileOutputStream(F_IDX)){
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(almacen);
			oos = new ObjectOutputStream(fosIdx);
			oos.writeObject(proximoId);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
			
	}
	
	//Generar el id
	//Añadir un elemento en el map
	@Override
	public void insertar(Contacto c) {
		c.setIdContacto(proximoId++);
		almacen.put(c.getIdContacto(), c);
		grabar();
	}

	@Override
	public void actualizar(Contacto c) {
		almacen.replace(c.getIdContacto(), c);
		grabar();
	}

	// retorna false si el contacto no existe
	@Override
	public boolean eliminar(int idContacto) {
		Contacto eliminado = almacen.remove(idContacto);
		grabar();
		return eliminado != null;
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
