package ejercicios07;

public class Ejercicio07 {
	// Desarrollar un método que reciba un array de dos dimensiones de enteros y retorne la columna cuya suma es mayor. Si hay dos que coinciden, retornar la primera.
	
	public static int[] columnaMayor(int[][] array) {
		int aux [] = new int[array.length];
		int posicion = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length;j++) {
				aux[i] += array[j][i];
				if(i>0 && aux[i]>aux[i-1]) {
					posicion = i;
				}
			}	
		}		
		for(int i = 0; i < array.length; i++) {
			
			aux[i] = array[i][posicion];
		}		
		return aux;
	}
	
	public static void main(String[] args) {
		int[][] array = {{1,2,4},{2,5,3},{2,5,3}};
		for(int i = 0; i < array.length; i++) {
			System.out.println(columnaMayor(array)[i]);
		}
	}
}
