package ejercicios04;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner teclado= new Scanner (System.in);
		@SuppressWarnings("unused")
		int dia, mes, year, dias;
		
		System.out.println("Indique el día: ");
		dia = teclado.nextInt();
		System.out.println("Indique el mes: ");
		mes = teclado.nextInt();
		System.out.println("Indique el año: ");
		year = teclado.nextInt();
		
		if (mes != 2) {
			if (mes <= 7) {
				if(mes%2 !=0) {
					dias = 31;
				} else {
					dias = 30;
				}
			} else {
				if(mes%2 !=0) {
					dias = 30;
				} else {
					dias = 31;
				}
			}
		} else {
			dias =28;
		}
		
		while (dia > dias || mes < 1 || mes > 12) {		
			System.out.println("Fecha incorrecta, ingrese otra.");
			System.out.println("Indique el día: ");
			dia = teclado.nextInt();
			System.out.println("Indique el mes: ");
			mes = teclado.nextInt();
			System.out.println("Indique el año: ");
			year = teclado.nextInt();
			
			if (mes != 2) {
				if (mes <= 7) {
					if(mes%2 !=0) {
						dias = 31;
					} else {
						dias = 30;
					}
				} else {
					if(mes%2 !=0) {
							dias = 30;
					} else {
						dias = 31;
					}
				}
			} else {
				dias =28;
			}			
		}
		
		System.out.println("Quedan " + (dias-dia) +" para finalizar el mes.");
	}
}