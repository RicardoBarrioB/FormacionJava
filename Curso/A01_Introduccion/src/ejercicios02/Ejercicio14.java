package ejercicios02;

import java.util.Scanner;

public class Ejercicio14 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int num;
		Scanner teclado = new Scanner(System.in);
		
		do{
			System.out.print("Ingrese un número entero positivo: ");
			num = teclado.nextInt();
		} while(num<0);
		
		for(int i=num ; i>0 ; i--) {
			System.out.print(i + ",");
		}
		System.out.print(0);
		
	}
}