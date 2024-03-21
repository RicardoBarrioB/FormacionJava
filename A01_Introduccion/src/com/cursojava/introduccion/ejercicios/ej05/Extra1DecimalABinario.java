package com.cursojava.introduccion.ejercicios.ej05;

public class Extra1DecimalABinario {
	public static String decimalBinario(long n) {
		if(n < 2)
			return "" + n;
		else {
			return decimalBinario(n/2) + (n%2);}
	}
	
	public static void main(String[] args) {
		System.out.println(decimalBinario(52));
	}
}
