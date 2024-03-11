package ejercicios04;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado= new Scanner (System.in);
		int num;
		String forma;
		System.out.print("Ingrese el tamaño: ");
		num = teclado.nextInt();
		
		for(int i = 1; i<=num;i++) {
			forma ="";
			for (int j = 1; j<=i; j++) {
				forma = forma + "*";
			}
			System.out.println(forma);
		}
		
		for(int i = num; i>=1;i--) {
			forma ="";
			for (int j = 1; j<=i; j++) {
				forma = forma + "*";
			}
			System.out.println(forma);
		}
		
		for(int i = 1; i <= num ; i++) {
			forma ="";
			for (int j = 2 ; j<=i; j++) {
				forma = forma + " ";
			}
			for (int j = 0; j<=num-i; j++) {
				forma = forma + "*";
			}
			System.out.println(forma);
		}
		
		for(int i = num; i >= 1 ; i--) {
			forma ="";
			for (int j = i-1 ; j>=1; j--) {
				forma = forma + " ";
			}
			for (int j = 1; j<=num+1-i; j++) {
				forma = forma + "*";
			}
			System.out.println(forma);
		}			
	}
}
