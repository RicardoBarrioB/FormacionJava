package ejercicios02;

import java.util.Scanner;

public class Ejercicio01a {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int sum = 0;
		System.out.print("Ingrese cantidad de números a sumar: ");
		Scanner teclado = new Scanner(System.in);
		int cant = teclado.nextInt();
		
		for(int i = 1; i<=cant; i++) {
			System.out.print("Ingrese un número a sumar: ");
			int num = teclado.nextInt();
			sum+=num;
		}
		
		System.out.println("El resultado de la suma es: " + sum);
	}
}
