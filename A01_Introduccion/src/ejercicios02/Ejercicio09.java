package ejercicios02;

import java.util.Scanner;

public class Ejercicio09 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int num, positivos = 0, negativos = 0, pares=0, impares=0, sum = 0, mayor, menor, posMayor, posMenor;
		double media;
		System.out.print("Ingrese cantidad de números a procesar: ");
		Scanner teclado = new Scanner(System.in);
		int cant = teclado.nextInt();
		
		
		System.out.print("Ingrese el primer número: ");
		num = teclado.nextInt();
		
		sum+=num;
		
		if (num>=0)
			positivos++;
		else
			negativos++;
		
		if(num%2==0)
			pares++;
		else
			impares++;
		
		mayor=num;
		posMayor=1;
		menor=num;
		posMenor=1;
		
		for(int i = 2; i<=cant; i++) {
			System.out.print("Ingrese otro número: ");
			num = teclado.nextInt();
			
			sum+=num;
			
			if (num>=0)
				positivos++;
			else
				negativos++;
			
			if(num%2==0)
				pares++;
			else
				impares++;
			
			if (num>mayor) {
				mayor=num;
				posMayor=i;}
				
			if (num<menor) {
				menor=num;
				posMenor=i;}
		
		}
		
		media = (double)sum/cant;
		
		System.out.println(" Cantidad de nos. Ingresados: " + cant +
				"\n Sumatoria: " + sum +
				"\n Cantidad de nros positivoso 0: " + positivos +
				"\n Cantidad de nros negativos: " + negativos +
				"\n Cantidad de nros pares: " + pares+
				"\n Cantidad de nros impares: " + impares +
				"\n Mayor valor: " + mayor + " - ingresado en el lugar: " + posMayor +
				"\n Menor valor: " + menor + " – ingresado en el lugar: " + posMenor +
				"\n Media: " + media);
		
	}
}
