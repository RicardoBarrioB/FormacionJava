package ejercicios04;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner teclado= new Scanner (System.in);
		@SuppressWarnings("unused")
		int dia, mes, year, dias, cantDias = 0;
		
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
			
		switch(mes) {
		case 12:
			cantDias += 31;
		case 11:
			cantDias += 30;
		case 10:
			cantDias += 31;
		case 9:
			cantDias += 30;
		case 8:
			cantDias += 31;
		case 7:
			cantDias += 31;
		case 6:
			cantDias += 30;
		case 5:
			cantDias += 31;
		case 4:
			cantDias += 30;
		case 3:
			cantDias += 31;
		case 2:
			cantDias += 28;		
		case 1:
			cantDias += 31;		
		}
			
		System.out.println("Días transcurridos: " + (cantDias-(dias-dia)));
	}
}