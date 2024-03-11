package ejercicios05a;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String palabra1, palabra2, solucion = "";
		int largo;
		
		System.out.println("Escriba la primera palabra: ");
		palabra1 = teclado.nextLine();
		
		System.out.println("Escriba la segunda palabra: ");
		palabra2 = teclado.nextLine();
		
		if(palabra2.length()>palabra1.length()){		
			largo = palabra1.length();
		}else {
			largo = palabra2.length();
		}
		
		for(int i = 0; i < largo; i++){	
			solucion += (palabra1.charAt(i)+"") + (palabra2.charAt(i)+"");
		}
		
		if(palabra2.length()>palabra1.length()){		
			solucion += palabra2.substring(largo,palabra2.length());
		}else {
			solucion += palabra1.substring(largo,palabra2.length());
		}
		
		System.out.println(solucion);
	}
}
