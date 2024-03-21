package ejercicios07;

public class Ejercicio06 {
	//Desarrollar un método que reciba un array de dos dimensiones de enteros y retorne la fila cuya suma es mayor. Si hay dos que coinciden, retornar la primera.
	
	public static int[] filaMayor(int[][] array) {
		int suma [] = new int[array.length];
		int posicion = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length;j++) {
				suma[i] += array[i][j];
				if(i>0 && suma[i]>suma[i-1]) {
					posicion = i;
				}
			}	
		}
		return array[posicion];
	}
	
	public static void main(String[] args) {
		int[][] array = {{1,2,4},{2,5,3},{2,5,3}};
		for(int i = 0; i < array.length; i++) {
			System.out.println(filaMayor(array)[i]);
		}
	}
}
