
package ejercicios02;

public class Ejercicio11 {
	public static void main(String[] args) {
		int multi=0;

		for(int i = 1; i<=9;i++) {
			for(int j = 1; j<=9;j++) {
				multi=i*j;
				System.out.println(i + "*" + j + " = " + multi);
			}
			System.out.println("");
		}
	}
}