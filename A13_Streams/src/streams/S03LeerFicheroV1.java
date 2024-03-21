package streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class S03LeerFicheroV1 {
	public static void main(String[] args) {
		String fichero = "d:/datos/ContactoDaoMemDinamica.java";
		System.out.println(leeFichero(fichero));
	}
	
	public static String leeFichero(String fichero) {
		StringBuilder resultado = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
			br.lines().forEach(linea -> resultado.append(linea + "\n"));
			
			
		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + fichero + "no existe o no tienes acceso");
		} catch(IOException e) {
			System.out.println("No se puede leer fichero");
		}
		return resultado.toString();
	}
}
