package ejercicios05b;

public class Ejercicio04 {
	public static String separarCadena(String cadena, String caracter) {
		String resultado = "";		
		for(int i = 0; i <cadena.length(); i++) {
			resultado += "" + cadena.charAt(i) + caracter;
		}
		resultado = resultado.substring(0,resultado.length()-1);
		return resultado;
	}
	
	public static void main(String[] args) {
		String cadena = "cadena";
		String caracter = "*";
		System.out.println(separarCadena(cadena,caracter));
	}
}
