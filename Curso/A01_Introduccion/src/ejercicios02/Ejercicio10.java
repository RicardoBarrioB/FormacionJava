package ejercicios02;

import java.util.Scanner;

public class Ejercicio10 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int num, multi;
		System.out.print("Ingrese un número: ");
		Scanner teclado = new Scanner(System.in);
		num = teclado.nextInt();
		
		for(int i = 1; i<=9;i++) {
			multi=num*i;
			System.out.println(num + "*" + i + " = " + multi);
		}
	}
}
