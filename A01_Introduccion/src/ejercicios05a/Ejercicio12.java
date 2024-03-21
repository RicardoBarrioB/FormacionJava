package ejercicios05a;

import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String frase;
		String solucion = "";
		
		System.out.println("Escriba una frase: ");
		frase = teclado.nextLine();
		
		for(int i = 0; i < frase.length(); i++) {	
			if (frase.charAt(i) == Character.toUpperCase(frase.charAt(i))) {
				solucion +=  Character.toLowerCase(frase.charAt(i));
			}else {
				solucion +=  Character.toUpperCase(frase.charAt(i));
			}
		}
		System.out.println(solucion);
	}
}