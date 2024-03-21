package ejercicios04;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner teclado= new Scanner (System.in);
		int dia1, mes1, year1, dia2, mes2, year2, dias1, dias2, fecha1, fecha2, cantYear =0, cantMeses = 0, cantDias = 0;
		byte primeraFecha1 = 1, primeraFecha2 = 1;
		
		do {
			if(primeraFecha1 == 1) {		
				primeraFecha1 = 0;
			}else {
				System.out.println("Fecha incorrecta, ingrese otra.");
			}
			
			System.out.println("Indique el día: ");
			dia1 = teclado.nextInt();
			System.out.println("Indique el mes: ");
			mes1 = teclado.nextInt();
			System.out.println("Indique el año: ");
			year1 = teclado.nextInt();
							
				
				if (mes1 != 2) {
					if (mes1 <= 7) {
						if(mes1%2 !=0) {
							dias1 = 31;
						} else {
							dias1 = 30;
						}
					} else {
						if(mes1%2 !=0) {
							dias1 = 30;
						} else {
							dias1 = 31;
						}
					}
				} else {
					dias1 =28;
				}
			
		} while (dia1 > dias1 || mes1 < 1 || mes1 > 12);
		
		
		do {	
			if(primeraFecha2 == 1) {				
				primeraFecha2 = 0;	
			}else {
				System.out.println("Fecha incorrecta, ingrese otra.");
			}	
			
			System.out.println("Indique el día: ");
			dia2 = teclado.nextInt();
			System.out.println("Indique el mes: ");
			mes2 = teclado.nextInt();
			System.out.println("Indique el año: ");
			year2 = teclado.nextInt();
			
				if (mes2 != 2) {
					if (mes2 <= 7) {
						if(mes2%2 !=0) {
							dias2 = 31;
						} else {
							dias2 = 30;
						}
					} else {
						if(mes2%2 !=0) {
							dias2 = 30;
						} else {
							dias2 = 31;
						}
					}
				} else {
					dias2 =28;
				}
				
		}while (dia2 > dias2 || mes2 < 1 || mes2 > 12); 
		

		fecha1 = year1*10000 + mes1*100 + dia1;
		fecha2 = year2*10000 + mes2*100 + dia2;
		
		if(fecha2<fecha1){
			dia1 = dia1 + dia2;
			dia2 = dia1 - dia2;
			dia1 = dia1 - dia2;
			
			mes1 = mes1 + mes2;
			mes2 = mes1 - mes2;
			mes1 = mes1 - mes2;
			
			year1 = year1 + year2;
			year2 = year1 - year2;
			year1 = year1 - year2;
		}
		
		
		if(year1 == year2 && mes1 == mes2) {	
			cantDias = dia2-dia1;		
		}else {
			if(dia2<dias2){
				cantMeses += (mes2-1);
				cantDias += dia2;			
			}else{
				cantMeses += mes2;
			}
			
			if(dia1>1){
				cantDias += dias1-dia1;
				cantMeses += 12-mes1;
			}else {
				cantMeses += 12 - (mes1-1);
			}
		}
		
		
		if(year1 == year2) {
			cantMeses = mes2-mes1;
		}
		
		if(cantDias>dias1) {
			cantDias -= dias1;
			cantMeses += 1;
		}
		
		if(year1 != year2) {
			if(dia2 == 31 && mes2 == 12) {
				cantYear += year2+1;	
			}else {
				cantYear += year2;
			}
		
			if(dia1 == 1 && mes1 == 1) {
				cantYear -= year1;
			}else {
				cantYear -= year1+1;
			}
		}
		
		System.out.println("Han transcurrido " + cantDias + " días, " + cantMeses + " meses y " + cantYear + " años.");
	}
}
