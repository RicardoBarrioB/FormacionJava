package test;

import java.util.Iterator;

import listas.genericos.Lista;
import listas.genericos.ListaArray;
import listas.genericos.ListaEnlazada;


public class Test03ForEach {
	public static void main(String[] args) {
		Lista<String> l1 = new ListaArray<>();
		l1.add("uno");
		l1.add("dos");
		l1.add("tres");
		l1.add("cuatro");
		
		for(String palabra : l1) {
			System.out.println(palabra.toUpperCase());
		}
		
		System.out.println("------------------------------");
		
		Lista<String> l2 = new ListaEnlazada <>();
		l2.add("uno");
		l2.add("dos");
		l2.add("tres");
		l2.add("cuatro");
		
		for(String palabra : l2) {
			System.out.println(palabra.toUpperCase());
		}
		
		
		Iterator<String> it = l2.iterator();
		while(it.hasNext()) {
			String el = it.next();
			System.out.println(el);
			if(el.equals("3"))
				it.remove();
		}
	}
}
