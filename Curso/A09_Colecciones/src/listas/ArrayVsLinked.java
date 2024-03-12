package listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayVsLinked {
	public static void main(String[] args) {
		int cant = 1_000_000;
		
		List<String> al = new ArrayList<>();
		carga(al,cant);
		
		long t0 = System.currentTimeMillis();
		recorrePos(al);
		long tf = System.currentTimeMillis();
		System.out.println("ArrayList por posicion : " + (tf - t0) + " ms");
		
		List<String> il = new LinkedList<>();
		carga(il,cant);
		
//		t0 = System.currentTimeMillis();
//		recorrePos(il);
//		tf = System.currentTimeMillis();
//		System.out.println("LinkedList: " + (tf - t0) + " ms");
		
		
		t0 = System.currentTimeMillis();
		recorreIterator(al);
		tf = System.currentTimeMillis();
		System.out.println("ArrayList iterator: " + (tf - t0) + " ms");
		
		t0 = System.currentTimeMillis();
		recorreIterator(il);
		tf = System.currentTimeMillis();
		System.out.println("LinkedList Iterator: " + (tf - t0) + " ms");

		
	}
	
	public static void carga(List<String> lista, int cant) {
		for(int i = 0; i < cant; i++) {
			lista.add(""+i);
		}
	}
	
	public static void recorrePos(List<String> lista) {
		for(int i = 0; i < lista.size(); i++) {
			String nada = lista.get(i);
		}
	}
	
	public static void recorreIterator(List<String> lista) {
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			String nada = it.next();
		}
	}
	
	
	//UTILIZAR ESTE
	public static void recorreForEach(List<String> lista) {
		for(String nada : lista) {	
		}
	}
}







