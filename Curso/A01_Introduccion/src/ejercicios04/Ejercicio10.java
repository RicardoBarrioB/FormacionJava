package ejercicios04;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner teclado= new Scanner (System.in);
		int mes, dias = 0;
		
		System.out.println("Indique el número de mes: ");
		mes = teclado.nextInt();
		
		String nombreMes;
		
		switch (mes) {
			case 1:
				nombreMes = "enero";
				break;
			case 2:
				nombreMes = "febrero";
				dias = 28;
				break;
			case 3:
				nombreMes = "marzo";
				break;
			case 4:
				nombreMes = "abril";
				break;
			case 5:
				nombreMes = "mayo";
				break;
			case 6:
				nombreMes = "junio";
				break;
			case 7:
				nombreMes = "julio";
				break;
			case 8:
				nombreMes = "agosto";
				break;
			case 9:
				nombreMes = "septiembre";
				break;
			case 10:
				nombreMes = "octubre";
				break;
			case 11:
				nombreMes = "noviembre";
				break;
			case 12:
				nombreMes = "diciembre";
				break;
			default:
				nombreMes = "mes incorrecto";
				break;
		}
		
		if(dias == 0) {
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
		}
		
		System.out.println("Es " + nombreMes + " y tiene " + dias + " días." );
	}
}

