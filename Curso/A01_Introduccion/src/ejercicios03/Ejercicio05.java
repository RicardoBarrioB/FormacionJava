package ejercicios03;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double euros, resul=0;
		String continuar;
		String moneda = "";
		
		System.out.print("Ingrese cantidad de dinero(€): ");
		euros = teclado.nextDouble();
		teclado.nextLine();
		System.out.println("");
		
		do{
			System.out.println("Indique a que divisa desea convertir:"
				+ "\n Dolares (d)"
				+ "\n Libras esterlinas (l)"
				+ "\n Yenes (y)"
				+ "\n Dolares Canadienses (dc)");		
			continuar = teclado.nextLine();
		}while(!continuar.equals("d") && !continuar.equals("l") && !continuar.equals("y") && !continuar.equals("dc"));
		
		switch(continuar) {
			case "d":
				resul = 0.88*euros;
				moneda = "dolares";
				break;
			case "l":
				resul = 1.2*euros;
				moneda = "Libras";
				break;
			case "y":
				resul = 0.0077*euros;
				moneda= "yenes";
				break;
			case "dc":
				resul = 0.71*euros;
				moneda = "dolares canadienses";
				break;
		}
		System.out.println(euros + " euros son " + resul + " " + moneda);
	}
}

