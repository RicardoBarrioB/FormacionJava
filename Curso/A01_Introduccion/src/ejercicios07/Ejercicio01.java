package ejercicios07;

public class Ejercicio01 {
	public static void imprimirMatriz(double[][] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
}
