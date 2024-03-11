package ejercicios04;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		int num = 0, solu, aux, buenos, regulares;
		
	//	num = (int)Math.floor(Math.random()*9000+1000);
		
		for(int i = 4; i >= 1; i--){
			do {
				aux = (int)Math.floor(Math.random()*10);
			}while (aux == Math.floor((num/10)%10) || aux == Math.floor((num/100)%10) || aux == Math.floor(num/1000));
			num += aux*Math.pow(10, i-1);
		}
		
		System.out.println(num);
		
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		do {
			buenos = regulares = 0;
			System.out.print("Intenta adivinar el número, entre 1000 y 9999: ");
			solu = teclado.nextInt();
			teclado.nextLine();
			
			while (solu<1000 || solu>9999) {
				System.out.print("El número ingresado no está entre los valores indicados, ingrese otro: ");
				solu = teclado.nextInt();
				teclado.nextLine();
			}
			
			for(int i = 4; i >= 1; i--) {
				
				aux = num;
				
				for(int j = 4; j >= 1; j--) {
					if(solu%10 == aux%10) {
						if(i==j){
							buenos++;
						} else {
							regulares++;
						}
					}
					aux = (int)Math.floor(aux/10);	
				}				
				solu = (int)Math.floor(solu/10);
			}
			
			System.out.println(buenos + " buenos y " + regulares + " regulares." );
		}while(buenos != 4);
		
		System.out.println("Has acertado!!");
		
	}
}






