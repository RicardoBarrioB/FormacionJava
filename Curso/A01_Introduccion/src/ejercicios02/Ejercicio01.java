package ejercicios02;

import java.util.Scanner;

public class Ejercicio01 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Ingrese un número: ");
		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		
		for(int i = 1; i<=num; i++) {
			System.out.println(i);			
		}		
	}
}
