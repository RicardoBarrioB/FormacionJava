package com.cursojava.introduccion.ejercicios.ej05;

public class ExtraDecimalAHexadecimal {
	public static String decimalHexadecimal(long n){
		
		if(n < 16)
			return n%16 < 10?"" + (char)(n+48):"" + (char)(n+55);
		else
			return "" + decimalHexadecimal(n/16) + (char)(n%16<10?(n%16)+48:(n%16)+55);
	}
	
	public static void main(String[] args) {
		System.out.println(decimalHexadecimal(879456));
	}
}
