package listas;

public class ListaArray implements Lista {
	
	private String[] almacen;
	private int cant;
	
	public ListaArray(int cant) {
		almacen = new String[cant];
	}
	
	public ListaArray() {
		this(10);
	}
	

	@Override
	public void add(String s) {
		if(cant == almacen.length)
			redimensionar();
		almacen[cant++] = s;		
	}
	
	private void redimensionar() {
		String[] aux = new String[almacen.length*2];
		
		for(int i = 0; i < almacen.length; i++) {
			aux[i] = almacen[i];
		}
		
		almacen = aux;
	}

	@Override
	public void remove(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String find(int pos) {
		if(pos < 0 || pos >= cant)
			return null;
		return almacen[pos];
	}

	@Override
	public int size() {
		return cant;
	}

}
