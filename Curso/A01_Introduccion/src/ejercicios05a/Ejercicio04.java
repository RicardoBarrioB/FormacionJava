package ejercicios05a;

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String cadena;
		System.out.println("Escribe una cadena");
		cadena = teclado.nextLine();
		if ((cadena.toUpperCase()).startsWith("H")) {
			System.out.println("La candena empieza por H/h.");
		}else {
			System.out.println("La candena no empieza por H/h.");
		}
	}
}

