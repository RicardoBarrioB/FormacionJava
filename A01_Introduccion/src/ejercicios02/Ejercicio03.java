package ejercicios02;

import java.util.Scanner;

public class Ejercicio03 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double mayor, num;
		Scanner teclado = new Scanner(System.in);
			
		System.out.print("Ingrese un número: ");
		mayor = teclado.nextDouble();
		teclado.nextLine();
		System.out.println("¿Desea ingresar otro número (s)?");
		String respuesta = teclado.nextLine();
		
		while (respuesta.equals ("s")) {
			System.out.print("Ingrese un número: ");
			num = teclado.nextDouble();
			teclado.nextLine();
			if (mayor<num)
			mayor = num;
			System.out.println("¿Desea ingresar otro número (s)?");
			respuesta = teclado.nextLine();
		}
		
		System.out.println("El numero mayor es el " + mayor);	
	}
}
