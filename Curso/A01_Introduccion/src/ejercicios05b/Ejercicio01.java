package ejercicios05b;

public class Ejercicio01 {
	public static String invertir(String cadena) {
		String invertida = "";
		for(int i = cadena.length()-1; i >= 0; i--) {
			invertida += "" + cadena.charAt(i);
		}
		return invertida;
	}
	
	public static void main(String[] args) {
		String cadena = "hola";
		System.out.println(invertir(cadena));
		
	}
}

