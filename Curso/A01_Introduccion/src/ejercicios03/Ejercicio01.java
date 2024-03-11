package ejercicios03;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double nota, mayor, menor;
		int continuar;
		System.out.print("Ingrese una nota: ");
		nota = teclado.nextDouble();
		mayor=nota;
		menor=nota;
		System.out.println("");
		System.out.println("¿Quiere continuar? Si no escriba -1");		
		continuar = teclado.nextInt();
			
		while (continuar !=-1) {
			System.out.print("Ingrese una nota: ");
			nota = teclado.nextDouble();
			System.out.println("");
			System.out.println("¿Quiere continuar? Si no escriba -1");		
			continuar = teclado.nextInt();
			if(nota>mayor)
				mayor=nota;
			if(nota<menor)
				menor=nota;
		}
		
		System.out.println("La mayor nota es " + mayor + " y la menor es " + menor);
	}
}
