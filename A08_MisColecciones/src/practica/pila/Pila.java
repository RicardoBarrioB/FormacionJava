package practica.pila;

import java.util.Iterator;

public class Pila <T> implements Stack <T>{
	
	Nodo primero;
	int cant;

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(T t) {
		Nodo aux = primero;
		primero = new Nodo(t);
		primero.proximo = aux;
		cant++;
	}

	@Override
	public T pop() {
		Nodo aux = primero;
		primero = primero.proximo;
		cant--;
		return (T) aux.nodo;
	}

	@Override
	public T peek() {
		return (T) primero.nodo;
	}

	@Override
	public int size() {
		return cant;
	}

	@Override
	public boolean isEmpty() {
		return cant == 0;
	}
	
	class Nodo <T>{
		T nodo;
		Nodo proximo;
		
		Nodo(T t){
			this.nodo = t;
		}	
	}

}
