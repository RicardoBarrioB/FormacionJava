package ejercicios05b;

public class Ejercicio02 {
	public static boolean palindromo(String cadena) {
		String auxiliar = ""; 
		for(int i = cadena.length()-1; i >= 0; i--) {
			auxiliar += "" + cadena.charAt(i);
		}		
		return auxiliar.equals(cadena);
	}
	
	public static void main(String[] args) {
		String cadena = "hola aloh";
		if(palindromo(cadena)) {
			System.out.println("Es un palindromo");
		}else {
			System.out.println("No es un palindromo");
		}
	}
}
