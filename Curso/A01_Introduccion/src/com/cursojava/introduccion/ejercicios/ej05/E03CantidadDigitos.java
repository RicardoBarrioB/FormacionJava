package com.cursojava.introduccion.ejercicios.ej05;

public class E03CantidadDigitos {
	public static int cantDigitos(int n){
		if(Math.round(n/10) == 0)
			return 1;
		else
			return 1+cantDigitos(n/10);
	}
	
	public static void main(String[] args) {
		System.out.println(cantDigitos(1456889));
	}
	
}
