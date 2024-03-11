package com.cursojava.introduccion.teoria;

public class T07PruebaFor {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		int i;
		for(i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println(i);
		
		
		for(int j = 1, k = 100; j<=10 && k >=0; j++, k -= 10) {
			System.out.println(j + "\t" + k);
		}	
	}
}
