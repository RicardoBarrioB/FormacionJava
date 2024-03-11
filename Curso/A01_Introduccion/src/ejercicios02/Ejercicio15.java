
package ejercicios02;

import java.util.Scanner;

public class Ejercicio15 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int num;
		Scanner teclado = new Scanner(System.in);
		
		do{
			System.out.print("Ingrese un número entero mayor que 0: ");
			num = teclado.nextInt();
		} while(num<=0);
		
		for(int i=num ; i>0 ; i--) {
			if(num%i==0)
			System.out.println(i);
		}
	}
}
