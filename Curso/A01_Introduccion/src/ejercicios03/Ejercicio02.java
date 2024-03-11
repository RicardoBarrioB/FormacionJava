package ejercicios03;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double num, mayor, menor, primero, ultimo;
		int cant;
		String continuar;
		System.out.print("Ingrese un número: ");
		num = teclado.nextDouble();
		teclado.nextLine();
		mayor=num;
		menor=num;
		primero=num;
		ultimo=num;
		cant=1;
		do {
		System.out.print ("¿Desea continuar? (s/n): ");
		continuar = teclado.nextLine();
		}while (!continuar.equals("s") && !continuar.equals("n"));
		
		while (continuar.equals("s")) {
			System.out.print("Ingrese un número: ");
			num = teclado.nextDouble();
			teclado.nextLine();
			cant++;
			if(num>mayor)
				mayor=num;
			if(num<menor)
					menor=num;
			ultimo=num;	
			do {
				System.out.print ("¿Desea continuar? (s/n): ");
				continuar = teclado.nextLine();
			}while (!continuar.equals("s") && !continuar.equals("n"));
		}
		System.out.println(" Se han registrado " + cant + " numeros" + "."+ 
				"\n El primer numero ingresado ha sido el " + primero + "." + 
				"\n El último numero ingresado ha sido el " + ultimo + "." +
				"\n El mayor es " + mayor + "." + 
				"\n El menor es " + menor + ".");
	}
}
