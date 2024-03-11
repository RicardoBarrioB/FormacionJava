package ejercicios05a;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String frase;
		String caracter;
		
		System.out.println("Escriba una frase: ");
		frase = teclado.nextLine();
		
		System.out.println("Escriba un caracter: ");
		caracter = teclado.nextLine();
		
		while (caracter.length() != 1) {
			System.out.println("Error!! Por favor, ingrese solo un caracter: ");
			caracter = teclado.nextLine();
		}
		
		for(int i = 0; i < frase.length(); i++) {	
			if (caracter.equals(frase.charAt(i)+"")) {
				frase = frase.substring(0,i);
			}
		}
		
		System.out.println(frase);
	}
}
