package ejercicios02;

import java.util.Scanner;

public class Ejercicio16 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int num, cont=0;
		Scanner teclado = new Scanner(System.in);
		
		do{
			System.out.print("Ingrese un número entero mayor que 2: ");
			num = teclado.nextInt();
		} while(num<=2);
		
		for(int i=num/2 ; i>=2 ; i--) {
			if(num%i==0)
			cont++;
		}
		if(cont==0) {
			System.out.println("El número " + num + " es primo");
		}else {
			System.out.println("El número " + num + " no es primo");
		}
	}
}
