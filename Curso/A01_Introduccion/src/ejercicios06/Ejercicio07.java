package ejercicios06;

public class Ejercicio07 {
	public static int [] intercalarArrays(int[] array1, int[] array2) {
		int[] resultado = new int[array1.length+array2.length];
		
		int tamaño, menor;
		
		if (array1.length > array2.length) {
			menor = array2.length;
			
			for(int i = 0; i < array1.length-array2.length; i++) {
				resultado[menor*2+i] = array1[menor+i]; 
			}
			
		}else {
			menor = array1.length;
			for(int i = 0; i < array2.length-array1.length+1; i++) {
				resultado[(menor*2)-1+i] = array2[menor-1+i]; 
			}
		}
		
		for(int i = 0; i < menor; i++) {
			resultado[2*i] = array1[i];
		}
		
		for(int i = 0; i < menor; i++) {
			resultado[(2*i)+1] = array2[i];
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		int[] array1 = {8,4,0,9,8,1,7,2};
		int[] array2 = {5,20,9,60,3,40};
		int[] array = new int [array1.length+array2.length];
		array = intercalarArrays(array1, array2);
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
