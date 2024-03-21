package ejercicios05a;

import java.util.Scanner;

public class Ejercicio10a {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String frase;
		String caracter;
		int posicion;
		
		System.out.println("Escriba una frase: ");
		frase = teclado.nextLine();
		
		System.out.println("Escriba un caracter: ");
		caracter = teclado.nextLine();
		
		while (caracter.length() != 1) {
			System.out.println("Error!! Por favor, ingrese solo un caracter: ");
			caracter = teclado.nextLine();
		}
		
		posicion = frase.indexOf(caracter);
		frase = frase.substring(0,posicion);
		
		
		System.out.println(frase);
	}
}
