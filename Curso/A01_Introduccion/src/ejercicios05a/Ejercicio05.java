package ejercicios05a;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String caracter;
		int num;
		
		System.out.println("Escribe un caracter: ");
		caracter = teclado.nextLine();
		
		while (caracter.length() != 1) {
			System.out.println("Error!! Por favor, ingrese solo un caracter: ");
			caracter = teclado.nextLine();
		}
		
		System.out.println("Escribe un número para repetir el caracter: ");
		num = teclado.nextInt();
		teclado.nextLine();
		
		for(int i = 1; i <= num; i++) {
			// System.out.print(caracter);		
			caracter += caracter.charAt(0);
		}
		System.out.print(caracter);
	}
}
