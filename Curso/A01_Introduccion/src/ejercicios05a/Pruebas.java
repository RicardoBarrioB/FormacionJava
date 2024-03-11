package ejercicios05a;

import java.util.Scanner;

public class Pruebas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String seguir = "";
		
		String cadena2 = teclado.nextLine();
		
		while(!seguir.equals("-1")){
			seguir = teclado.nextLine();
			if(!seguir.equals("-1")) {
				cadena2 += "\n" + seguir;
			}
		}
		System.out.println(cadena2);
		System.out.println(Ejercicio22.cuentaParrafos(cadena2));
		
	/*	String cadena1 = "cApaZ";
		String resultado = Ejercicio23.codificar(cadena1, 3);
		System.out.println(resultado);		
		System.out.println(Ejercicio23.descodificar(resultado, 3));
		*/
		
	}
}
