package ejercicios05a;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String cadena;
		System.out.println("Escribe una cadena");
		cadena = teclado.nextLine();
		
		if(cadena.isEmpty()) {
			System.out.println("La candena está vacía.");
		}else {
			System.out.println("La candena no está vacía.");
		}
	}
}
