package ejercicios05a;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String frase;
		
		System.out.println("Escriba una frase: ");
		frase = teclado.nextLine();
		
		for(int i = 0; i < frase.length()-1; i++) {
			if(("" + frase.charAt(i) + frase.charAt(i+1)).equals("ny")) {
				frase = frase.substring(0,i) + "ñ" + frase.substring(i+2);
			}
		}		
			
		System.out.println(frase);
	}
}
