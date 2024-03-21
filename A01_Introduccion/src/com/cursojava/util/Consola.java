package com.cursojava.util;

import java.util.Scanner;

public class Consola {
	
	public static Scanner tec = new Scanner(System.in);
	
	public static String leerCadena() {
		String cadena = tec.nextLine();
		return cadena;
	}
	
	public static String leerCadena(String mensaje) {
		System.out.println(mensaje);
		String cadena = tec.nextLine();
		return cadena;
	}
	
	public static int leerInt() {
		int num = tec.nextInt();
		tec.nextLine();
		return num;
	}
	
	public static int leerInt(String mensaje) {
		System.out.println(mensaje);
		int num = tec.nextInt();
		tec.nextLine();
		return num;
	}
	
	public static void mostrarRedondeado(double num, int decimales) {
	System.out.println(Math.round(num*Math.pow(10, decimales))/Math.pow(10, decimales));
	}
	
	public static void main(String[] args) {
		double num = 10.465778948;
		int deci = 3;
		Consola.mostrarRedondeado(num,deci);
	}
}
