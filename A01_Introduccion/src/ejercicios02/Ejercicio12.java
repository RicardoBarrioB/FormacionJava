package ejercicios02;

import java.util.Scanner;

public class Ejercicio12 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int num, trian;
		System.out.print("Ingrese el número: ");
		Scanner teclado = new Scanner(System.in);
		num = teclado.nextInt();
		
		for(int i = 1; i<=num;i++) {
			trian=0;
			for(int j = 1; j<=i; j++) {
				trian+=j;
			}
			
			System.out.println(i + " - " + trian);
		}
	}
}
