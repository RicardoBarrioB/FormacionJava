package ahorcado;

import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String continuar = "s";
		System.out.println("Bienvenido al juego del ahorcado!!!!\n");
		do {
			int eleccion, count, indexA = 0, indexF = 0, intentos = 6;
			String[] fallos = new String[6];
			String letra;	
			
			System.out.println("Elija el numero de letras (escriba el numero): \n");
			System.out.println("| 4 letras 	8 letras |\n| 5 letras 	9 letras |\n| 6 letras     10 letras |\n| 7 letras		 |\n");
			
			eleccion = teclado.nextInt();
			teclado.nextLine();
			
			while(eleccion != 4 && eleccion != 5 && eleccion != 6 && eleccion != 7 && eleccion != 8 && eleccion != 9 && eleccion != 10 ) {
				System.out.println("Valor incorrecto, vuelva a ingresarlo:\n");
				eleccion = teclado.nextInt();
				teclado.nextLine();
			}
			
			System.out.println("\nPerfecto comencemos!! (Tienes 6 intentos)");
			String palabra = Palabras.generarPalabra(eleccion);
			String[] aciertos = new String[palabra.length()];
			Arrays.fill(aciertos, "_");
			
			do {
				count = 0;
				Dibujar.dibujo(intentos-indexF);		
				System.out.print(Metodos.arrayToString(aciertos, palabra));
				System.out.println("\n");
				
				letra = Metodos.ingresarLetra(aciertos, fallos);
				
				if(Metodos.comprobarLetra(letra, palabra)) {
					aciertos[indexA] = letra;
					indexA++;
				}else {
					fallos[indexF] = letra;
					indexF++;
				}
				
				for(int i = 0; i < palabra.length(); i++) {
					for(int j = 0; j < palabra.length(); j++) {
						if(palabra.charAt(j) == aciertos[i].charAt(0)) {
							count++;
						}
					}
				}		
			}while (intentos>indexF && count < palabra.length());
			
			if(count == palabra.length()) {
				Dibujar.dibujo(intentos-indexF);
				System.out.print(Metodos.arrayToString(aciertos, palabra));
				System.out.println("\n");
				System.out.println("\nEnhorabuena!! La palabra era " + palabra + "\n");
			}else {
				Dibujar.dibujo(intentos-indexF);
				System.out.println("Se te han acabado los intentos, la palabra era: " + palabra + "\n");
			}
			
			do {
				System.out.println("¿Quieres volver a jugar? (s/n)");
				continuar = teclado.nextLine();
				System.out.println("\n");
			}while (!continuar.equals("s") && !continuar.equals("n"));
			
		} while (continuar.equals("s"));
	}
}
