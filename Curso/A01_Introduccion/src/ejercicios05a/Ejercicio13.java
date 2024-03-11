package ejercicios05a;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String frase;
		int cont = 0;
		
		System.out.println("Escriba una frase: ");
		frase = teclado.nextLine();
		
		for(int i = 0; i < frase.length() && cont>=0; i++) {	
			if(frase.charAt(i) == '(') {
				cont++;
			}
			if(frase.charAt(i) == ')') {
				cont--;
			}
			
		}
		
		if(cont == 0) {
			System.out.println("Los parentesis están correctos");
		}else {
			System.out.println("Los parentesis no son correctos");
		}
	}
}
