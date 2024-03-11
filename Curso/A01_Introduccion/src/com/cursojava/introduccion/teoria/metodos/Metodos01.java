package com.cursojava.introduccion.teoria.metodos;

public class Metodos01 {
	public static double pow(double base, double exp) {
		double pow = 1;
		
		for(int i = 1; i <= exp; i++) {
			pow *= base;
		}		
		return pow;
	}
}
