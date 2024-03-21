package com.cursojava.introduccion;

import java.util.Scanner;

public class CMayorDeTres {
	public static void main(String[] arg){
		int num1, num2, num3, mayor;
		mayor=0;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingresa un valor ");
		num1=teclado.nextInt();
		System.out.print("Ingresa un valor ");
		num2=teclado.nextInt();
		System.out.print("Ingresa un valor ");
		num3=teclado.nextInt();
		
		
		
//		if(num1==num2 && num2==num3) {
//			mayor=num1;
//		}
//		else {
//			if(num1>num2) {
//				if(num1>num3) {
//					mayor = num1;
//				}
//				else {
//					mayor=num3;
//				}
//			}
//			else {
//				if(num2>num1) {
//					if (num2>num3) {
//						mayor=num2;
//					}
//					else {
//						mayor=num3;
//					}
//				}
//			
//			}
//		}
		if(num1>num2 && num1>num3)
			mayor = num1;
		else if (num2>num3)
			mayor = num2;
		else 
			mayor = num3;
		
		System.out.println("El numero mayor es " + mayor);
	}
}
