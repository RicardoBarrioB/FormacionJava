package ejercicios05a;

import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String frase;
		int cont = 0;
		
		System.out.println("Escriba una frase: ");
		frase = teclado.nextLine();
		frase = frase.toUpperCase();
		
		for(int i = 0; i < frase.length(); i++) {	
			if (frase.charAt(i) == 'A' || frase.charAt(i) == 'E'|| frase.charAt(i) == 'I' || frase.charAt(i) == 'O' || frase.charAt(i) == 'U') {
				cont++;
			}
		}
		if(cont>0) {
			System.out.println("Hay " + cont + " vocales.");
		}else {
			System.out.println("No hay ninguna vocal.");
		}
	}
}