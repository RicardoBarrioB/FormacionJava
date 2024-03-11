package ejercicios02;

import java.util.Scanner;

public class Ejercicio04 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double mayor, num, menor;
		Scanner teclado = new Scanner(System.in);
			
		System.out.print("Ingrese un número: ");
		mayor = teclado.nextDouble();
		menor = mayor;
		teclado.nextLine();
		System.out.println("¿Desea ingresar otro número (s)?");
		String respuesta = teclado.nextLine();
		
		while (respuesta.equals ("s")) {
			System.out.print("Ingrese un número: ");
			num = teclado.nextDouble();
			teclado.nextLine();
			if (num>mayor)
				mayor = num;
			if (num<menor)
				
			System.out.println("¿Desea ingresar otro número (s)?");
			respuesta = teclado.nextLine();
		}
		
		System.out.println("El numero mayor es el " + mayor + ", y el menor es el " + menor);	
	}
}

