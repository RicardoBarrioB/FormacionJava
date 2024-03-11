package ejercicios04;

import java.util.Scanner;

public class Ejercicio16_2 {
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
		
		if (cambio>=5)
			cant = (int)Math.floor(cambio/5);
			cambio = Math.round((cambio%5)*100)/100.;
		if(cant>=1)
			System.out.println("Se devolverá la siguiente cantidad en billetes: " + cant*5 + "€");
		System.out.println("Monedas a devolver:");
		
		cant =0;
		
		if (cambio>=2)
			cant = (int)Math.floor(cambio/2);
			cambio = Math.round((cambio%2)*100)/100.;
		if(cant>=1)
			System.out.println("Monedas de 2€: " + cant + " (" + cant*2 + "€)");
		cant =0;
		
		if (cambio>=1)
			cant = (int)Math.floor(cambio/1);
			cambio = Math.round((cambio%1)*100)/100.;
		if(cant>=1)
			System.out.println("Monedas de 1€: " + cant + " (" + cant + "€)");
		cant =0;
		if (cambio>=0.5)
			cant = (int)Math.floor(cambio/0.5);
			cambio = Math.round((cambio%0.5)*100)/100.;
		if(cant>=1)
			System.out.println("Monedas de 50 cent: " + cant + " (" + cant*0.5 + "€)");
		cant =0;
		if (cambio>=0.2)
			cant = (int)Math.floor(cambio/0.2);
			cambio = Math.round((cambio%0.2)*100)/100.;
		if(cant>=1)
			System.out.println("Monedas de 20 cent: " + cant + " (" + cant*0.2 + "€)");
		
		cant =0;
		if (cambio>=0.1)
			cant = (int)Math.floor(cambio/0.1);
			cambio = Math.round((cambio%0.1)*100)/100.;
		if(cant>=1)
			System.out.println("Monedas de 10 cent: " + cant + " (" + cant*0.1 + "€)");
		
		cant =0;
		if (cambio>=0.05)
			cant = (int)Math.floor(cambio/0.05);
			cambio = Math.round((cambio%0.05)*100)/100.;
		if(cant>=1)
			System.out.println("Monedas de 5 cent: " + cant + " (" + cant*0.05 + "€)");
		
		cant =0;
		if (cambio>=0.02)
			cant = (int)Math.floor(cambio/0.02);
			cambio = Math.round((cambio%0.02)*100)/100.;
		if(cant>=1)
			System.out.println("Monedas de 2 cent: " + cant + " (" + cant*0.02 + "€)");

		cant =0;
		if (cambio>=0.01)
			cant = (int)Math.floor(cambio/0.01);
			cambio = Math.round((cambio%0.01)*100)/100.;
		if(cant>=1)
			System.out.println("Monedas de 1 cent: " + cant + " (" + cant*0.01 + "€)");
	}
}
