package ejercicios06;

public class Ejercicio04 {
	public static int[] arrayDoble(int[] array) {
		int[] resultado = new int[array.length*2];
		
		for(int i = 0; i < resultado.length; i++) {
			resultado[i] = array[i%array.length];
		}
			
		return resultado;
	}
}
