package ejercicios02;

import java.util.Scanner;

public class Ejercicio07 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int num, factorial = 1;
		System.out.print("Ingrese un número: ");
		Scanner teclado = new Scanner(System.in);
		num = teclado.nextInt();
		
		for(int i = num;i>=1; i--) {
			factorial*=i;
			}
		System.out.println("El factorial es: " + factorial);
	}
}
