package ejercicios02;

import java.util.Scanner;

public class Ejercicio08 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int num1, num2, mayor, menor;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese primer número: ");
		num1 = teclado.nextInt();
		System.out.print("Ingrese segundo número: ");
		num2 = teclado.nextInt();
		
		if(num1>=num2){
			mayor=num1;
			menor=num2;
		}else {
			mayor = num2;
			menor = num1;}
		
		menor = menor%2==0?menor:menor+1;
		
		for(int i = menor;i<=mayor;i+=2) {
			System.out.print(i+ " ");
		}
		
	}	
}
