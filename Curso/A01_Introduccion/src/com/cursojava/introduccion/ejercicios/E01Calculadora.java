package com.cursojava.introduccion.ejercicios;

import java.util.Scanner;

public class E01Calculadora {
	@SuppressWarnings("resource")
	public static void main(String[] arg) {
		double num1, num2, resu;
		resu = 0;
		System.out.print("Ingrese Operador (+,-,*,/): ");
		Scanner teclado = new Scanner (System.in);
		String operador = teclado.nextLine();
		
		System.out.print("Ingrese Primer Operando: ");
		num1 = teclado.nextDouble();
		
		System.out.print("Ingrese Segundo Operando: ");
		num2 = teclado.nextDouble();
		
		switch (operador) {
		case "*":
			resu = num1 * num2;
			break;
		case "/":
			resu = num1 / num2;
			break;
		case "-":
			resu = num1 - num2;
			break;
		case "+":
			resu = num1 + num2;
			break;
		}
		
		System.out.println("El resultado de la operación " + num1 + operador +num2 + " es " + resu);
	}
}
