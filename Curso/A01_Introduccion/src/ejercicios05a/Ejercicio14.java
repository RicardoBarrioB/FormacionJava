package ejercicios05a;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String frase;
		int cont = 0, palabra = 0;
		
		System.out.println("Escriba una frase: ");
		frase = teclado.nextLine();
		
		for(int i = 0; i < frase.length(); i++) {	
			if(frase.charAt(i) != ' '){
				cont++;
			}else {
				if(cont<3 && cont !=0) {
					palabra++;
					cont = 0;
				}else {
					cont = 0;
				}
			}
		}
		if(cont<3 && cont !=0) {
			palabra++;
		}
			
		System.out.println("Esta frase tiene " + palabra + " palabras de menos de 3 letras.");
	}
}
