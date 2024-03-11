package ejercicios06;

public class Ejercicio06 {
	public static int [] unirArrays(int[] array1, int[] array2) {
		int[] resultado = new int[array1.length+array2.length];
		
		for(int i = 0; i < array1.length; i++) {
			resultado[i] = array1[i];
		}
		
		for(int i = 0; i < array2.length; i++) {
			resultado[array1.length + i] = array2[i];
		}
		
		return resultado;
	}
}
