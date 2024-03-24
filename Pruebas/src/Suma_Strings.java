
public class Suma_Strings {

	public static String add(String a, String b) {
		StringBuilder suma = new StringBuilder();
		
		String mayor = a;
		String menor = b;
		
		if(a.length() < b.length()) {
			mayor = b;
			menor = a;
		}
		
		int dif = mayor.length() - menor.length();
		
		int aux = 0;
		
		for(int i = menor.length()-1; i >= 0; i--) {
			
			int valor = Character.getNumericValue(mayor.charAt(i+dif)) + Character.getNumericValue(menor.charAt(i));
			
			if(valor > 9) {
				suma.append(valor%10 + aux);
				aux = 1;

			}else {
				suma.append((valor + aux)%10);
				aux = (valor + aux)/10;
			}
		}

		for(int i = dif-1; i >= 0; i--) {
			int valor = Character.getNumericValue(mayor.charAt(i));
			
			if(valor > 9) {
				suma.append(valor%10 + aux);
				aux = 1;

			}else {
				suma.append((valor + aux)%10);
				aux = (valor + aux)/10;
			}
		}
		
		if(aux == 1) {
			suma.append(1);
		}
		
		while(suma.charAt(suma.length()-1) == '0') {
			suma.deleteCharAt(suma.length()-1);
		}

	    return suma.reverse().toString();
	  }
	
	public static void main(String[] args) {
		System.out.println(add("63829983432984289347293874", "90938498237058927340892374089"));
	}
}
