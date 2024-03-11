package ejercicios04;

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num, cifra;
		
		do {
		System.out.println("Ingrase un número entero de 4 cifras: ");
		num = teclado.nextInt();
		teclado.nextLine();
		} while (num<1000 || num>9999);
		
		for (int i = 4; i >= 1; i--) {
			cifra = (int)Math.floor(num/(int)Math.pow(10, i-1));
			num = num%(int)Math.pow(10, i-1);
			System.out.println(cifra);
		}
	}
}
