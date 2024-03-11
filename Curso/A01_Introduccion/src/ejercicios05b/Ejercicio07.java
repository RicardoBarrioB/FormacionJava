package ejercicios05b;

public class Ejercicio07 {
	public static double operar(String operacion){
		int i = 0;
		boolean encontrado = false;
		while (i<operacion.length() && !encontrado) {
			if(operacion.charAt(i)  == '+' || operacion.charAt(i)  == '-' || operacion.charAt(i)  == '*' || operacion.charAt(i)  == '/') {
				encontrado = true;
			}else {
				i++;
			}
		}
			
		switch(operacion.charAt(i)) {
		case '+':
			return Double.parseDouble(operacion.substring(0,i)) + Double.parseDouble(operacion.substring(i+1,operacion.length()));
		case '-':
			return Double.parseDouble(operacion.substring(0,i)) - Double.parseDouble(operacion.substring(i+1,operacion.length()));
		case '*':
			return Double.parseDouble(operacion.substring(0,i)) * Double.parseDouble(operacion.substring(i+1,operacion.length()));
		case '/':
			return Double.parseDouble(operacion.substring(0,i)) / Double.parseDouble(operacion.substring(i+1,operacion.length()));
		default:
			return 0;
		}
	}
	public static void main(String[] args) {
		String cadena = "45 / 28";
		System.out.println(operar(cadena));
	}
}
