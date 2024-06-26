package streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class S02LeerFicheroV0 {
	public static void main(String[] args) {
		String fichero = "d:/datos/ContactoDaoMemDinamica.java";
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(fichero));
			String leido;
			while((leido = br.readLine()) != null) {
				System.out.println(leido);
			}			
			
		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + fichero + "no existe o no tienes acceso");
		} catch(IOException e) {
			System.out.println("No se puede leer fichero");
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("No se pudo cerrar el fichero");
				}
			}
		}
	}
}
