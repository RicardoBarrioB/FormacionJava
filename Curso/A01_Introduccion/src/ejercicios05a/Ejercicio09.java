package ejercicios05a;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String frase;
		String solucion = "";
		System.out.println("Escriba una frase: ");
		frase = teclado.nextLine();
		
		for(int i = 0; i < frase.length(); i++) {	
			if (frase.charAt(i) != ' ') {
				solucion += frase.charAt(i);
			} else {
				solucion += "*";
			}
		}
		
		System.out.println(solucion);
	}
}
