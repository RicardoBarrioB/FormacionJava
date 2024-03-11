package com.cursojava.introduccion.ejercicios.ej05;

public class E02SumaNaturales {
	public static int sumNaturales(int n){
		if(n == 1)
			return 1;
		else
			return n + sumNaturales(n-1);
	}
	public static void main(String[] args) {
		System.out.println("La suma de los primeros " + 5 + " numeros naturales es: " + sumNaturales(5));
	}
}
