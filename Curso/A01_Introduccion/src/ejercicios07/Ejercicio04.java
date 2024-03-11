package ejercicios07;

public class Ejercicio04 {
	//Desarrollar un método que reciba un array de dos dimensiones de double y retorne la suma de cada fila.
	public static double[] sumaFilas(double[][] array) {
		double suma [] = new double[array.length];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length;j++) {
				suma[i] += array[i][j];
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
