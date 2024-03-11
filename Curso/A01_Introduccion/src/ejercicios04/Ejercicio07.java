package ejercicios04;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num, cifra, digitos = 0, aux, resu=0;

		System.out.println("Ingrese un número entero: ");
		num = teclado.nextInt();
		teclado.nextLine();
		aux=num;
		
/*		while ((int)Math.floor(aux)>0) {
			aux=aux/10;
			digitos++;
		}
	
		for (int i = 1; i <= digitos; i++) {
			cifra = (int)Math.floor(num/(int)Math.pow(10,i-1))%10;
			resu = resu + cifra*(int)Math.pow(10,digitos-i);
		}
		if(num == resu) {
			System.out.println("El " + num + " es capicúa!");
		}else {
			System.out.println("El " + num + " no es capicúa.");
		}*/
		if(Ejericio07Metodo.isCapicua(num)) {
			System.out.println("El " + num + " es capicúa!");
		}else {
			System.out.println("El " + num + " no es capicúa.");
		}
		
	}
}
