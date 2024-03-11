package ejercicios07;

public class Ejercicio03 {
	//Desarrollar un método que reciba un array de dos dimensiones de double (matriz matemática) y calcule la Traza. La traza es la sumatoria
	//de los elementos de la diagonal principal de una matriz cuadrada. Nosotros la calcularemos para cualquier matriz, no sólo cuadradas.
	
	public static double traza(double[][] array) {
		int menor = Math.min(array.length,array[0].length);
		double traza = 0;

		for(int i =0; i < menor; i++) {
			traza += array[i][i];
		}
		return traza;
	}
	
	public static void main(String[] args) {
		double[][] array = {{1,2,4},{2,5,3}};
		System.out.println(traza(array));
	}
}
