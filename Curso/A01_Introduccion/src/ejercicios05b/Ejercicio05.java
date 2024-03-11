package ejercicios05b;

public class Ejercicio05 {
	public static String separarCadenaTres(String cadena, String caracter) {
		String resultado = "";		
		for(int i = 0; i <cadena.length(); i++) {
			resultado += "" + cadena.charAt(i);
			if((i+1)%3 == 0)
				resultado += caracter;
		}
		if(resultado.charAt(resultado.length()-1) == caracter.charAt(0)) {
			resultado = resultado.substring(0,resultado.length()-1);
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		String cadena = "cadena";
		String caracter = "*";
		System.out.println(separarCadenaTres(cadena,caracter));
	}
}
