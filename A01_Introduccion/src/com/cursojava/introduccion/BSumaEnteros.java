package com.cursojava.introduccion;

import java.util.Scanner;

public class BSumaEnteros {

	public static void main(String[] arg) {
		
		int num1, num2, suma;
		
										   
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in); //Inicializamos el objeto teclado. Con la clase Scanner se leen cosas.
												// "System.in" es el teclado
			
		System.out.print("Ingresa el valor 1: ");
			
		num1 = teclado.nextInt();
			
		System.out.print("Ingresa el valor 2: ");
			
		num2 = teclado.nextInt();
			
		suma = num1 + num2;
			
		System.out.print("La suma de los dos valores " + num1 + " y " + num2 + " es: " + suma );
			
	}
		
}
