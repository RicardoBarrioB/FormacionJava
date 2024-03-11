package calculadora.matrices;

public class Operaciones {

	public static double[][] sumMatrices(double[][] matrizA, double [][] matrizB) {
		
		double[][] resultado = new double [matrizA.length][matrizA[0].length];
		
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[0].length; j++) {
				resultado[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}	
		
		return resultado;
	}
	
	
	public static double[][] restaMatrices(double[][] matrizA, double [][] matrizB) {
		
		return sumMatrices(matrizA, matrizPorEscalar(matrizB, -1));
	}
	
	public static double[][] prodMatrices(double[][] matrizA, double [][] matrizB) {
		
		double[][] resultado = new double [matrizA.length][matrizB[0].length];
		
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizB[0].length; j++) {
				for(int k = 0; k < matrizA[0].length; k++) {
					resultado[i][j] += matrizA[i][k] * matrizB[k][j];
				}
			}
		}	
		
		return resultado;
	}
	
	
	public static double[][] matrizPorEscalar(double[][] matriz, double escalar) {
		
		double[][] resultado = new double [matriz.length][matriz[0].length];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				resultado[i][j] = matriz[i][j]*escalar;
			}
		}	
		
		return resultado;
	}
	
	public static double determinante(double [][] matriz) {
		double resultado = 0;
		int i = 0;
		if(matriz.length == 1) {
			resultado = matriz[0][0];
		}else {
			for(int j = 0; j < matriz.length; j++) {
				resultado += matriz[i][j] *Math.pow(-1, (j+2))*determinante(Matrices.submatriz(matriz, i, j));
			}
		}
		
		return resultado;
	}	
}
