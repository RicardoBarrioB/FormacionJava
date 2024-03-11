package ejercicios05a;

public class Ejercicio23 {

	public static String codificar(String codigo, int n) {
		
		String aux ="";	
		int fin;
	
		for(int i = 0; i < codigo.length(); i++) {
			if(codigo.charAt(i) == Character.toLowerCase(codigo.charAt(i))) {
				fin = 122;
			}else {
				fin = 90;
			}		
			if((codigo.charAt(i)+n) <= fin) {
				aux += (char)(codigo.charAt(i)+n);					
			}else {
				aux += (char)(codigo.charAt(i)+n-26);
			}				
		}				
		return aux;
	}
		
	public static String descodificar(String codigo, int n) {
		
		String aux ="";	
		int inicio;
	
		for(int i = 0; i < codigo.length(); i++) {
			if(codigo.charAt(i) == Character.toLowerCase(codigo.charAt(i))) {
				inicio = 97;
			}else {
				inicio = 65;
			}		
			if((codigo.charAt(i)-n) >= inicio) {
				aux += (char)(codigo.charAt(i)-n);					
			}else {
				aux += (char)(codigo.charAt(i)-n+26);
			}				
		}				
		return aux;
	}
		
}
