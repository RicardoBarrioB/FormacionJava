package calculadora.matrices;

public class Matrices {
	
	public static double [][] submatriz(double[][] matriz,int posY, int posX){
		double[][] submatriz = new double[matriz.length-1][matriz[0].length-1];
		int index1 = 0, index2;
		for(int i = 0; i < matriz.length; i++) {
			index2 = 0;
			if(posY != i) {
				for(int j = 0; j < matriz.length; j++) {
					if(posX != j) {
						submatriz[index1][index2] = matriz[i][j];
						index2++;
					}
				}
				index1++;
			}
		}
		
		return submatriz;
	}
	
	public static double [][] matrizAdjunta(double[][] matriz){
		double[][] matrizAdjunta = new double[matriz.length][matriz[0].length];
		
			for(int i = 0; i < matriz.length; i++) {
				for(int j = 0; j < matriz.length; j++) {
					matrizAdjunta [i][j] = Math.pow(-1,i+j+2)*Operaciones.determinante(submatriz(matriz, i, j));
				}
			}		
			
		return matrizAdjunta;
	}
	
	public static double [][] matrizTranspuesta(double[][] matriz){
		double[][] matrizTransp = new double[matriz[0].length][matriz.length];
		
		for(int i = 0; i < matrizTransp.length; i++) {
			for(int j = 0; j < matrizTransp[0].length; j++) {
				matrizTransp [i][j] = matriz[j][i];
			}
		}			
		
		return matrizTransp;
	}
	
	public static double[][] matrizInversa(double[][] matriz){
		
		if(matriz.length != matriz[0].length || Operaciones.determinante(matriz) == 0 ) {
			return null;
		}
		
		return Operaciones.matrizPorEscalar(matrizTranspuesta(matrizAdjunta(matriz)),1/Operaciones.determinante(matriz));
	}
}
