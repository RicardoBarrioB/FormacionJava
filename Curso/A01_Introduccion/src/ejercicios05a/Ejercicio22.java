package ejercicios05a;

public class Ejercicio22 {

	public static String insert(String cadena, String insertado, int pos) {
		cadena = cadena.substring(0,pos-1) + insertado + cadena.substring(pos-1, cadena.length());
		return cadena;
	}
	
	public static String delete(String cadena, int desde, int hasta) {	
		cadena = cadena.substring(0, desde-1) + cadena.substring(hasta,cadena.length());		
		return cadena;
	}
	
	int indexOf(String cadena, String buscado) {
		int pos = -1;
		
		for(int i = 0; i < cadena.length() && pos != -1; i++) {	
			if (buscado.equals(""+cadena.charAt(i))) {
				pos = i;
			}
		}	
		return pos;
	}
	
	public static String replace(String cadena, String buscado, String reemplazo) {
		
		for(int i = 0; i < cadena.length()-buscado.length(); i++ ) {
			if(cadena.substring(i,i+buscado.length()).equals(buscado)) {
				cadena = cadena.substring(0, i) + reemplazo + cadena.substring(i+buscado.length(),cadena.length());
				i += reemplazo.length() - 1;
			}
		}
		
		return cadena;
	}
	
	public static String capitalize(String cadena) {
		cadena = ("" + cadena.charAt(0)).toUpperCase() + cadena.substring(1, cadena.length()).toLowerCase();		
		return cadena;
	}
	
	public static int cuentaPalabras(String cadena) {
		int palabras = 0, cont =0;
		
		for(int i = 0; i < cadena.length(); i++) {	
			if(cadena.charAt(i) != ' '){
				cont++;
			}else {
				if(cont>0) {
					palabras++;
					cont = 0;
				}else {
					cont = 0;
				}
			}
		}		
		if(cont>0) {
			palabras++;
		}
		return palabras;		
	}
	
	public static int cuentaParrafos(String cadena) {
		
		int parrafo = 0, cont = 0;
		
		for(int i = 0; i < cadena.length(); i++) {	
			if(cadena.charAt(i) != '\n'){
				cont++;
			}else {
				if(cont>0) {
				parrafo++;
					cont = 0;
			}
			}
		}
		if(cont>0) {
			parrafo++;
		}		
		return parrafo;		
	}
	
}








