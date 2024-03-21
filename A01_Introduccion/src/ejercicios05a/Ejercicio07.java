package ejercicios05a;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String frase;
		String caracter;
		String solucion = "";
		boolean primero = true;
		
		System.out.println("Escriba una frase: ");
		frase = teclado.nextLine();
		
		System.out.println("Escriba un caracter: ");
		caracter = teclado.nextLine();
		
		while (caracter.length() != 1) {
			System.out.println("Error!! Por favor, ingrese solo un caracter: ");
			caracter = teclado.nextLine();
		}
		
		for(int i = 0; i < frase.length(); i++) {	
			if (caracter.equals(frase.charAt(i)+"")) {
				if(primero) {
					System.out.println("El caracter está en las siguientes posiciones: ");
					solucion = (i+1) + "";
					primero = false;
				}else {
					solucion += ", " + (i+1);
				}
			}
		}
		
		if(solucion.isEmpty()) {
			System.out.println("El caracter no está en la frase.");
		}else {
			System.out.println(solucion);
		}
	}
}


