package ejercicios03;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num, aleatorio;
		aleatorio = (int)Math.floor(Math.random()*101);
		System.out.print("Ingresa un número del 0 al 100: ");
		num = teclado.nextInt();
		
		while (num!=aleatorio) {
			if(num>aleatorio) {
				System.out.println("El número buscado es menor");
				System.out.print("Ingresa otro número del 0 al 100: ");
				num = teclado.nextInt();
			}else {
				System.out.println("El número buscado es mayor");
				System.out.print("Ingresa otro número del 0 al 100: ");
				num = teclado.nextInt();
			}
		}
			System.out.println("Enhorabuena el número " + num + " es correcto!!!");
	}
}
