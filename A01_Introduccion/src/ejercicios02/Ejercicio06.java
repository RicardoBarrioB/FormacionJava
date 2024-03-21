
package ejercicios02;

import java.util.Scanner;

public class Ejercicio06 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double num;
		int positivos = 0, negativos =0;
		String respuesta = "";
		Scanner teclado = new Scanner(System.in);
		
		 do {
			System.out.print("Ingrese un número: ");
			num = teclado.nextDouble();
			teclado.nextLine();
			if (num>=0) {
				positivos++;
			}else {
				negativos++;}	
			
			System.out.println("¿Desea ingresar otro número (s)?");
			respuesta = teclado.nextLine();
			
		} while (respuesta.equals ("s"));
		
		System.out.println("Hay " + positivos + " números positivos y " + negativos+ " números negativos");	
	}
}
