package calculadora.matrices;

import java.util.Scanner;

public class Consola {
	public static Scanner teclado = new Scanner(System.in);
	
	public static double[][] crearMatriz(){
		int filas, columnas;
		System.out.print("Ingrese la cantidad de filas de la matriz: ");
		filas = teclado.nextInt();
		teclado.nextLine();
		System.out.print("Ingrese la cantidad de columnas de la matriz: ");
		columnas = teclado.nextInt();
		teclado.nextLine();	
		double[][] matriz = new double[filas][columnas];
		System.out.println("Ingrese los elementos de la matriz (se rellena por filas): ");
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				System.out.print("Ingrese el elemento (" + i + "," + j + "): ");
				matriz[i][j] = teclado.nextDouble();
				teclado.nextLine();
			}
		}
		
		return matriz;
	}
	
	public static void imprimirMatriz(double[][] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
	
	public static double[][] operarMatrices(double[][] matrizA, double[][] matrizB, String operacion){
		
		double[][] resultado;
		
		switch (operacion){
				case "+":
				if(matrizA.length != matrizB.length || matrizA[0].length != matrizB[0].length ) {
					return null;
				}
				resultado = Operaciones.sumMatrices(matrizA, matrizB);
				break;
			case "-":
				if(matrizA.length != matrizB.length || matrizA[0].length != matrizB[0].length ) {
					return null;
				}
				resultado = Operaciones.restaMatrices(matrizA, matrizB);
				break;
			case "*":
				if(matrizA[0].length != matrizB.length) {
					return null;
				}
				resultado = Operaciones.prodMatrices(matrizA, matrizB);
				break;			
			case "/":
				if(matrizA[0].length != matrizB.length && matrizB.length != matrizB[0].length) {
					return null;
				}
				resultado = Operaciones.prodMatrices(matrizA, Matrices.matrizInversa(matrizB));
				break;				
			default:
				resultado = new double [0][0];
		}			
		
		return resultado;
	}
}
