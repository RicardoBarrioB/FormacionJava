package agenda.persistencia;

import agenda.modelo.Contacto;

public class ContactoDaoMemArray implements ContactoDao{
	
	private Contacto[] almacen;
	private int cant;
	
	public ContactoDaoMemArray(int cantInicial) {
		almacen = new Contacto[cantInicial];
	}
	
	public ContactoDaoMemArray() {
		this(10);
	}
	
	private void redimensionar() {
		Contacto[] nuevo = new Contacto[almacen.length*2];
		for(int i = 0; i < almacen.length; i++) {
			nuevo[i] = almacen[i];
		}
		almacen = nuevo;
	}

	@Override
	public void insertar(Contacto c) {
		c.setIdContacto(cant+1);
		if(cant == almacen.length)
			redimensionar();
		almacen[cant++] = c;
	}

	@Override
	public void actualizar(Contacto c) {
		if(existe(c)) {
			almacen[c.getIdContacto()-1] = c;
		}
	}

	@Override
	public boolean eliminar(int idContacto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(Contacto c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contacto buscar(int idContacto) {
		if(!existe(idContacto)) return null;
		return almacen[idContacto-1];
	}
	
	private boolean existe(Contacto c) {
		return existe(c.getIdContacto());
	}
	
	private boolean existe(int idContacto) {
		return idContacto > 0 && idContacto <= cant;
	}	
}
