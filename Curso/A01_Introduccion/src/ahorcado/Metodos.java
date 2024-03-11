package ahorcado;

import java.util.Scanner;

public class Metodos {	
	public static String ingresarLetra(String[] aciertos, String[] fallos) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indica una letra: ");
		String letra = teclado.nextLine();
		letra = letra.toLowerCase();
		boolean repetido;
		do {
			while(letra.length()!=1 || letra.charAt(0) > 122 || letra.charAt(0) < 97) {
				System.out.println("Cantidad de caracteres o caracteres no validos, indique una letra: ");
				letra = teclado.nextLine();
				letra = letra.toLowerCase();
			}
			
			repetido = false;
			for(int i = 0; i < 6 && !repetido; i++) {
				if(letra.equals(fallos[i])) {
					repetido = true;
				}
			}
			for(int i = 0; i < aciertos.length && !repetido; i++) {
				if(letra.equals(aciertos[i])) {
					repetido = true;
				}
			}
			if(repetido) {
				System.out.println("Letra repetida, indique otra: ");
				letra = teclado.nextLine();
			}			
		}while(repetido);
		
		return letra;
	}
	
	public static boolean comprobarLetra(String letra, String palabra) {
		boolean coincide = false;
		for(int i = 0; i < palabra.length() && !coincide; i++) {
			if(letra.charAt(0) == palabra.charAt(i)) {
				coincide = true;
			}
		}
		return coincide;
	}
	
	public static String arrayToString(String[] array, String palabra) {
		
		String resultado = "";
		
		for(int i = 0; i < palabra.length(); i++) {
			boolean encontrado = false;
			for(int j = 0; j< array.length && !encontrado ; j++) {
				if(palabra.charAt(i) == array[j].charAt(0)){
					resultado += palabra.charAt(i) + " ";
					encontrado = true;
				}
			}
			if(!encontrado) {
				resultado += "_ ";
			}			
		}		
		resultado = resultado.substring(0,resultado.length()-1);
		return Metodos.capitalize(resultado);
	}
	
	public static String mostrarFallos(String[] array) {
		
		String palabra = "";
		
		for(int i = 0; i < array.length; i++) {
			palabra += array[i] + " ";
		}
		palabra = palabra.substring(0,palabra.length()-1);
		return palabra;
	}
	
	public static String capitalize(String cadena) {
		cadena = ("" + cadena.charAt(0)).toUpperCase() + cadena.substring(1, cadena.length()).toLowerCase();		
		return cadena;
	}
	
}















