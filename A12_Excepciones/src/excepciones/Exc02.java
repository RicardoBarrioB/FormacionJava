package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exc02 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int valor = 0;
		boolean incorrecto;
		
		do {
			System.out.println("Ingrese un valor numerico: ");
			incorrecto = false;
			try {		
				valor = tec.nextInt();
				
			}catch(InputMismatchException e) {
				System.out.println("Valor incorrecto");
				incorrecto = true;
				tec.nextLine();
			}
			
		}while(incorrecto);
		
		System.out.println(valor);
	}
}
