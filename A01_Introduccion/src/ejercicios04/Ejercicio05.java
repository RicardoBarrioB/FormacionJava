package ejercicios04;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num, cifra, digitos = 0, aux;

		System.out.println("Ingrese un número entero: ");
		num = teclado.nextInt();
		teclado.nextLine();
		aux=num;
		
		while ((int)Math.floor(aux)>0) {
			aux=aux/10;
			digitos++;
		}
		
		for (int i = digitos; i >= 1; i--) {
			cifra = (int)Math.floor(num/(int)Math.pow(10, i-1));
			num = num%(int)Math.pow(10, i-1);
			System.out.println(cifra);
		}
	}
}
