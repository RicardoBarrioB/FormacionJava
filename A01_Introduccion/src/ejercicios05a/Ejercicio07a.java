package ejercicios05a;

import java.util.Scanner;

public class Ejercicio07a {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String frase;
		String caracter;
		String solucion = "";
		int posicion;
		
		System.out.println("Escriba una frase: ");
		frase = teclado.nextLine();
		
		System.out.println("Escriba un caracter: ");
		caracter = teclado.nextLine();
		
		while (caracter.length() != 1) {
			System.out.println("Error!! Por favor, ingrese solo un caracter: ");
			caracter = teclado.nextLine();
		}
		
		posicion = frase.indexOf(caracter);
		
		if(posicion != -1){
			System.out.println("El caracter está en las siguientes posiciones: ");
			while (posicion != -1) {
				solucion += posicion + ", ";
				posicion = frase.indexOf(caracter, posicion+1);
			}
			solucion = solucion.substring(0,solucion.length()-2);
			System.out.println(solucion);
			
		}else {
			System.out.println("El caracter no está en la frase.");
		}
	}
}
