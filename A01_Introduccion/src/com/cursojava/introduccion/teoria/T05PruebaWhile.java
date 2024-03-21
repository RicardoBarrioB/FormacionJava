package com.cursojava.introduccion.teoria;

public class T05PruebaWhile {
	public static void main(String[] args) {
		int i = 5;
		while(i<8)
			System.out.println(i++);
		i = 5;
		while(i<8) {
			System.out.println(++i);
		}
	}
}
