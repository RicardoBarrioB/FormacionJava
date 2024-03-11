package ejercicios05b;

public class Ejercicio06 {
	public static String capitalize(String cadena) {
		String resultado = "";
		for(int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) == ' ' || i == 0) {
				while(cadena.charAt(i) == ' ' && i < cadena.length()-1) {
					resultado += "" + cadena.charAt(i);
					i++;
				}
				resultado += ("" + cadena.charAt(i)).toUpperCase();
			}else {
				resultado += "" + cadena.charAt(i);
			}
		}	
		return resultado;
	}
	public static void main(String[] args) {
		String cadena = "   Congreso internacional de programación de String   ";
		System.out.println(capitalize(cadena));
	}
}
