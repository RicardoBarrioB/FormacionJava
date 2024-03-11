package com.cursojava.introduccion.ejercicios.ej05;

public class E05Potencia {
	public static int potencia(int base, int exp) {
		if (exp == 1)
			return base;
		else
			return base*potencia(base, exp-1);
	}
	
	public static void main(String[] args) {
		System.out.println(potencia(2,4));
	}
}
