package ejercicios03;

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num, resul, mayor, menor;
		resul = (int)Math.floor(Math.random()*101);
		
		System.out.println("¿El número que has pensado es el " + resul +"?");
		do {
			num = teclado.nextInt();
			teclado.nextLine();
		} while (num!=1 && num!=-1 && num!=0);
		
		mayor=100;
		menor=0;
		
		while (num==1 || num ==-1) {
			if(num==1) {
				System.out.println("Asi que el número es mayor...");
				menor=resul;
			} else {
				System.out.println("Asi que el número es menor...");
				mayor=resul;
			}
			resul= (int)Math.floor((menor+mayor)/2);
			System.out.println("¿El número que has pensado es el " + resul +"?");
			do {
				num = teclado.nextInt();
				teclado.nextLine();
			} while (num!=1 && num!=-1 && num!=0);
		}
		
			System.out.println("Genial!!! Así que el número era el " + resul);
	}
}
