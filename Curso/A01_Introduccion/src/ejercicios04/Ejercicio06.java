package ejercicios04;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num, cifra, digitos = 0, aux, resu=0;

		System.out.println("Ingrese un número entero: ");
		num = aux = teclado.nextInt();
		teclado.nextLine();
		
		while ((int)Math.floor(aux)>0) {
			aux=aux/10;
			digitos++;
		}
		System.out.println(digitos);
		
		for (int i = 1; i <= digitos; i++) {
			cifra = num%10;
			num = (int)Math.floor(num/10);
			resu = resu + cifra*(int)Math.pow(10,digitos-i);
		}
		System.out.print(resu);
	}
}
