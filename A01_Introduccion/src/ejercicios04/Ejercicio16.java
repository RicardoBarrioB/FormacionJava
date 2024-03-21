package ejercicios04;

import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner (System.in);
		
		double precio, dinero, cambio;
		int cant = 0;
		
		System.out.println("Indique el precio: ");
		precio = teclado.nextDouble();
		teclado.nextLine();
		
		System.out.println("Indique el dinero: ");
		dinero = teclado.nextDouble();
		teclado.nextLine();
		
		while (dinero<precio) {
			System.out.println("Dinero insuficiente, vuelva a indicar el dinero: ");
			dinero = teclado.nextDouble();
			teclado.nextLine();			
		}
		
		cambio = dinero - precio;
		
		while(cambio>=5) {
			cambio = cambio-5;
			cant++;
		}
		if(cant>0)
			System.out.println("Se devolverá la siguiente cantidad en billetes: " + cant*5 + "€");
		
		System.out.println("Monedas a devolver:");
		
		cant =0;
		while(cambio>=2) {
			cambio = cambio-2;
			cant++;
		}
		if(cant>0)
			System.out.println("Monedas de 2€: " + cant + " (" + cant*2 + "€)");
		
		cant =0;
		while(cambio>=1) {
			cambio = cambio-1;
			cant++;
		}
		if(cant>0)
			System.out.println("Monedas de 1€: " + cant + " (" + cant + "€)");
		
		cant =0;
		while(cambio>=0.5) {
			cambio = cambio-0.5;
			cant++;
		}
		if(cant>0)
			System.out.println("Monedas de 50 cent: " + cant + " (" + cant*0.5 + "€)");
		
		cant =0;
		while(cambio>=0.2) {
			cambio = cambio-0.2;
			cant++;
		}
		if(cant>0)
			System.out.println("Monedas de 20 cent: " + cant + " (" + cant*0.2 + "€)");
		
		cant =0;
		while(cambio>=0.1) {
			cambio = cambio-0.1;
			cant++;
		}
		if(cant>0)
			System.out.println("Monedas de 10 cent: " + cant + " (" + cant*0.1 + "€)");
		
		cant =0;
		while(cambio>=0.05) {
			cambio = cambio-0.05;
			cant++;
		}
		if(cant>0)
			System.out.println("Monedas de 5 cent: " + cant + " (" + cant*0.05 + "€)");
		
		cant =0;
		while(cambio>=0.02) {
			cambio = cambio-0.02;
			cant++;
		}
		if(cant>0)
			System.out.println("Monedas de 2 cent: " + cant + " (" + cant*0.02 + "€)");
		
		cant =0;
		while(cambio>=0.01) {
			cambio = cambio-0.01;
			cant++;
		}
		if(cant>0)
			System.out.println("Monedas de 1 cent: " + cant + " (" + cant*0.01 + "€)");
		System.out.println(cambio);
	}
}
