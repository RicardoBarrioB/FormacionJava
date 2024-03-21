package ejercicios06;

public class Ejercicio05 {
	public static double[] sumaArrays(double[] array1, double[] array2) {
		int tamaño, menor;
		
		if (array1.length > array2.length) {
			tamaño = array1.length;
			menor = array2.length;
		}else {
			tamaño = array2.length;
			menor = array1.length;
		}
		
		double[] suma = new double [tamaño];
		
		for(int i = 0; i < menor ; i++) {	
			suma[i] = array1[i] + array2[i];
		}
		
		if(tamaño == array1.length) {	
			for(int i = menor; i < tamaño; i++ ){
				suma[i] = array1[i];
			}
		}else {
			for(int i = menor; i < tamaño; i++ ){
				suma[i] = array2[i];
			}
		}
		
		return suma;
	}
}
