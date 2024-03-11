package ejercicios05a;

import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String cadena;
		
		System.out.println("Escribe una cadena: ");
		cadena = teclado.nextLine();		
		
		for(int i = 0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}
	}
}