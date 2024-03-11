package ejercicios05a;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String frase;
		int cont = 0;
		
		System.out.println("Escriba una frase: ");
		frase = teclado.nextLine();
		
		for(int i = 0; i < frase.length() && frase.charAt(i) == ' '; i++) {	
			cont++;
		}
		frase = frase.substring(cont, frase.length()-1);
		cont = 0;
		for(int i = frase.length()-1; i >=0 && frase.charAt(i) == ' '; i--) {	
			cont++;
		}
		frase = frase.substring(0, frase.length()-cont);
		
			
		System.out.println(frase);
	}
}

