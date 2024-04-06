package calculadora.matrices;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double[][] resultado, matriz1, matriz2;		
		
		System.out.println("Elige la operación que desea realizar:\n - Suma (+)\n - Resta (-)\n - Multiplicación (*)\n - Division(/)\n - Determinante(det)");
		String eleccion = teclado.nextLine();
		while (!eleccion.equals("+") && !eleccion.equals("-") && !eleccion.equals("*") && !eleccion.equals("/") && !eleccion.equals("det")) {
			System.out.print("Operación incorecta, elija una de las opciones anteriores: ");
			eleccion = teclado.nextLine();
		}
		
		boolean repetir = true;
		while(eleccion.equals("det") && repetir) {
			System.out.println("\nCrea la matriz:\n");
			matriz1 = Consola.crearMatriz();
			System.out.println("Matriz:\n");
			Consola.imprimirMatriz(matriz1);
			if(matriz1.length == matriz1[0].length) {
				System.out.println("El determinante de la matriz es: " + Operaciones.determinante(matriz1));
				repetir = false;
			}else {
				System.out.println("\nNo existe el deteminante, necesita ser una matriz cuadrada.");
			}
		};		
		
		repetir = true;
		while(!eleccion.equals("det") && repetir) {
			System.out.println("Crea la primera matriz:\n");
			matriz1 = Consola.crearMatriz();
			System.out.println("Primera matriz:\n");
			Consola.imprimirMatriz(matriz1);
			
			System.out.println("Crea la segunda matriz:\n");
			matriz2 = Consola.crearMatriz();
			System.out.println("Segunda matriz:\n");
			Consola.imprimirMatriz(matriz2);
			
			resultado = Consola.operarMatrices(matriz1, matriz2, eleccion);
			if(resultado == null) {
				System.out.println("No se puede realizar la operacion con las matrices indicadas vuelva a indicarlas:\n");
			}else{
				System.out.println("Resultado operación:\n");
				Consola.imprimirMatriz(resultado);
				repetir = false;
			}
		}				
	}
}



