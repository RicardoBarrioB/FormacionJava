package ejercicios02;

import java.util.Scanner;

public class Ejercicio02 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int sum = 0;
		System.out.print("Ingrese cantidad de números a sumar: ");
		Scanner teclado = new Scanner(System.in);
		int cant = teclado.nextInt();
		for(int i = 1; i<=cant; i++) {
			sum+=i;
		}
		System.out.println("El resultado de la suma es: " + sum);
	}
}
