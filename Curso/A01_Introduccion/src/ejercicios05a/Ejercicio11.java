package ejercicios05a;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String frase;
		String solucion = "";
		String aux;
		
		System.out.println("Escriba una frase: ");
		frase = teclado.nextLine();
		aux = frase.toUpperCase();
		
		for(int i = 0; i < frase.length(); i++) {	
			if (aux.charAt(i) == 'A' || aux.charAt(i) == 'E'|| aux.charAt(i) == 'I' || aux.charAt(i) == 'O' || aux.charAt(i) == 'U') {
				solucion +="";
			}else {
				solucion += frase.charAt(i);
			}
		}
		System.out.println(solucion);
	}
}
