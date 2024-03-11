package ejercicios07;

public class Ejercicio05 {
	//Desarrollar un método que reciba un array de dos dimensiones de double y retorne la suma de cada columna.
	public static double[] sumaFilas(double[][] array) {
		double suma [] = new double[array[0].length];
		for(int i = 0; i < array[0].length; i++) {
			for(int j = 0; j < array.length;j++) {
				suma[i] += array[j][i];
			}
		}
		return suma;
	}
	public static void main(String[] args) {
		double[][] array = {{1,2,4},{2,5,3},{2,5,3}};
		for(int i = 0; i < array.length; i++) {
			System.out.println(sumaFilas(array)[i]);
		}
	}
}
