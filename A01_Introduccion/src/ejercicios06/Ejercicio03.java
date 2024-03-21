package ejercicios06;

public class Ejercicio03 {
	public static int [] arrayAlReves(int [] array) {
		int [] inverso = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			inverso[i] = array[(array.length-1)-i];
		}
		
		return inverso;
	}
}