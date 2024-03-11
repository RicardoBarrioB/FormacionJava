package ejercicios04;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado= new Scanner (System.in);
		int lado;
		String cuadrado;
		System.out.print("Ingrese el tamaño del cuadrado: ");
		lado = teclado.nextInt();
		
		for(int i = 1; i<=lado;i++) {
			cuadrado ="";
			for (int j = 1; j<=lado; j++) {
				if(i == 1 || i == lado || j == 1 || j == lado) {
					cuadrado = cuadrado + "*";
				}else {
					cuadrado = cuadrado + " ";
				}
			}
			System.out.println(cuadrado);
		}
	}
}
