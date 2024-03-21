package ejercicios05a;

import java.util.Scanner;

public class Ejercicio16 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String frase, caracter;
		int cont = 0;
		
		System.out.println("Escriba una palabra o frase: ");
		frase = teclado.nextLine();
		
		System.out.println("Escriba un caracter: ");
		caracter = teclado.nextLine();
		
		while (caracter.length() != 1) {
			System.out.println("Error!! Por favor, ingrese solo un caracter: ");
			caracter = teclado.nextLine();
		}
		
		for(int i = 0; i < frase.length(); i++) {	
			if((frase.charAt(i)+"").equals(caracter)){
				cont++;
			}
		}
					
		System.out.println("El caracter " + caracter + " aparece " + cont + " veces en la palabra/frase");
	}
}
