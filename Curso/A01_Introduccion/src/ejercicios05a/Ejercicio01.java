package ejercicios05a;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		String nombre;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner (System.in);
		System.out.println("Escribe tu nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Hola " + nombre);
	}
}
