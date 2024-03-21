package ejercicios05a;

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String frase, caracter1, caracter2;
		
		System.out.println("Escriba una frase: ");
		frase = teclado.nextLine();
		
		System.out.println("Escriba el caracter que quiere sustituir: ");
		caracter1 = teclado.nextLine();
		
		while (caracter1.length() != 1) {
			System.out.println("Error!! Por favor, ingrese solo un caracter: ");
			caracter1 = teclado.nextLine();
		}
		
		System.out.println("Escriba el caracter por el que lo quiere sustituir: ");
		caracter2 = teclado.nextLine();
		
		while (caracter1.length() != 1) {
			System.out.println("Error!! Por favor, ingrese solo un caracter: ");
			caracter2 = teclado.nextLine();
		}
		
		for(int i = 0; i < frase.length()-1; i++) {	
			if((""+frase.charAt(i)).equals(caracter1)) {
				frase = frase.substring(0,i) + caracter2 + frase.substring(i+1);
			}
		}		
			
		System.out.println(frase);
	}
}
