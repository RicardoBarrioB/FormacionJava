package com.cursojava.introduccion.teoria;

public class T02SecuenciasEscape {
	public static void main(String[] arg) {
		System.out.println("\"Hola\"");
		System.out.println("\"Hola\"\tQue tal\nAdios");
		System.out.println("c:\\nuevo");
		
		String muLargo= """
				ag\
				""";
		System.out.println(muLargo);

	}

}
