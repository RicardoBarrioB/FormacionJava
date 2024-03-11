package ejercicios07;

public class Ejercicio02 {
	//Desarrollar un método que reciba un array de dos dimensiones de double y retorne la suma total de todos los elementos.
	
	public static double sumaArrays(double[][] array) {
		double suma = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length;j++) {
				suma += array[i][j];
			}
		}
		return suma;
	}
}
