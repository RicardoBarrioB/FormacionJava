package practica.pila;

public interface Stack <T> extends Iterable<T>{

	void push(T t); //guarda un elemento en la pila
	T pop(); //extraer el top del elemento que está arriba
	T peek(); //consulta el top de la pila, la parte de arriba sin extraerlo
	int size();
	boolean isEmpty();
}
