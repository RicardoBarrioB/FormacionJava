package ejercicios04;

import java.util.Scanner;

public class Ejercicio01 {

	@SuppressWarnings("resource")
	public static void main(String[] arg) {
		double num1, num2, resu;
		Scanner teclado = new Scanner (System.in);
		String operador;
		resu = 0;
		do {
			System.out.print("Ingrese Operador (+,-,*,/): ");
			operador = teclado.nextLine();
		} while (!operador.equals("+") && !operador.equals("-") && !operador.equals("*") && !operador.equals("/"));
		
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
		
		System.out.println("El resultado de la operación " + num1 + operador + num2 + " es " + resu);
	}
}

