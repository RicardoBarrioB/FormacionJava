package ejercicios05a;

import java.util.Scanner;

public class Ejercicio11a {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String frase;
		String solucion = "";
		
		System.out.println("Escriba una frase: ");
		frase = teclado.nextLine();
		
		solucion = frase.replace("a", "")
                .replace("e", "")
                .replace("i", "")
                .replace("o", "")
                .replace("u", "")
                .replace("A", "")
                .replace("E", "")
                .replace("I", "")
                .replace("O", "")
                .replace("U", "");
		
		System.out.println(solucion);
	}
}
