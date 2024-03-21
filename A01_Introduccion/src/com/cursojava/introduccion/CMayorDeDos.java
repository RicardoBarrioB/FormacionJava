package com.cursojava.introduccion;

import java.util.Scanner;

public class CMayorDeDos {	
	public static void main(String[] arg) {
		int num1, num2, mayor;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingresa un valor ");
		num1 = teclado.nextInt();
		System.out.print("Ingresa un valor ");
		num2=teclado.nextInt();
		
	if(num1>num2) {
		mayor=num1;
	}
	else {
		mayor = num2;
	}
	
	
// Otras formas de realizarlo:
//	if(num1>num2) mayor=num1;
//	else mayor = num2;
//	
//	if(num1>num2)
//		mayor=num1;
//	else 
//		mayor = num2;

	System.out.print("El mayor es "+mayor);
	
}
}
