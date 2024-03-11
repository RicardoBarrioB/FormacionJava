package ejercicios05a;

import java.util.Scanner;

public class Ejercicio21 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String contraseña;
		int mayus, minus, signo, numero;
		mayus = minus = signo = numero =0;
		System.out.println("Escriba su contraseña: ");
		contraseña = teclado.nextLine();
		
		if(contraseña.length()>7) {
			for(int i = 0; i < contraseña.length()-1; i++) {
				if(contraseña.charAt(i)>=48 && contraseña.charAt(i)<=57) {
					numero++;
				}
				else if (contraseña.charAt(i)>=65 && contraseña.charAt(i)<=90) {
					mayus++;
				}
				else if (contraseña.charAt(i)>=97 && contraseña.charAt(i)<=122) {
					minus++;
				}
				else {
					signo++;
				}
			}			
		}		
		if(numero > 0 && mayus > 0 && minus > 0 && signo > 0) {
			System.out.println("La contraseña es Fuerte");
		}else {
			System.out.println("La contraseña es DEBIL se recomienda cambiar");
		}
	}
}
