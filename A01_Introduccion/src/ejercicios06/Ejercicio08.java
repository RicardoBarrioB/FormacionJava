package ejercicios06;

public class Ejercicio08 {
	public static double[] arrayEspejo(double[] array) {
		for(int i = 0; i < array.length/2; i++) {
			array[i] = array[i] + array[(array.length-1)-i];
			array[(array.length-1)-i] = array[i] - array[(array.length-1)-i];
			array[i] = array[i] - array[(array.length-1)-i];
		}
	
		return array;
	}
	
	public static void main(String[] args) {
		double[] array = {5.20,9.60,3.40,8.40,9.80,7.20, 10.30};
		
		array = arrayEspejo(array);
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
