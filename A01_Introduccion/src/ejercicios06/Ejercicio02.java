package ejercicios06;

public class Ejercicio02 {
	public static int [] cuadradoArray(int [] array) {
		int [] resultado = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			resultado [i] = array[i]*array[i];
		}
		
		return resultado;
	}
}
