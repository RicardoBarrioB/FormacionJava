
package ejercicios05b;


public class Ejercicio03 {
	public static String siglas(String cadena) {
		String siglas = "";
		
		for(int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) == ' ' || i == 0) {
				while(cadena.charAt(i) == ' ' && i < cadena.length()-1) {
					i++;
				}
			if(cadena.charAt(i) != ' ')	
				siglas += ("" + cadena.charAt(i)).toUpperCase();
			}
		}
		return siglas;
	}
	public static void main(String[] args) {
		String cadena = "  uni   djsd  ldkdf  ";
		System.out.println(siglas(cadena));
	}
}
