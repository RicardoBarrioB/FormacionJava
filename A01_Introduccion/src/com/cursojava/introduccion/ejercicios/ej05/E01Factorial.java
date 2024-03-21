package com.cursojava.introduccion.ejercicios.ej05;

public class E01Factorial {
		
	public static int factorial(int n) {
		if (n == 0)
			return 1;
		else return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(5 + "! = " + factorial(5));
	}
}
