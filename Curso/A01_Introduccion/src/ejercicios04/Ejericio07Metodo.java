package ejercicios04;

public class Ejericio07Metodo {
	public static boolean isCapicua (int num) {
		int cifra, digitos = 0, aux = num, resu=0;
		while ((int)Math.floor(aux)>0) {
			aux=aux/10;
			digitos++;
		}
		
		for (int i = 1; i <= digitos; i++) {
			cifra = (int)Math.floor(num/(int)Math.pow(10,i-1))%10;
			resu = resu + cifra*(int)Math.pow(10,digitos-i);
		}
		return num == resu;		
	}
}
