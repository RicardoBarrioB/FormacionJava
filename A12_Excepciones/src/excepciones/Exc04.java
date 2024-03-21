package excepciones;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exc04 {
	
	public static void main(String[] args) {
		
		Exc04 fichero = null;
		
		try {
			fichero = open();
			fichero.read();
			return;
		} catch(IOException e) {
			System.out.println("AVISO AL USUARIO");
		} finally {
			System.out.println("Esto se ejecuta siempre!!!");
			if(fichero != null) {
				try {
					fichero.close();
				} catch (IOException e) {
				
				}
			}
		}	
	}
	
	static Exc04 open() throws FileNotFoundException{
		return new Exc04();
	}
	
	static void read() throws IOException{
		
	}
	
	static void close() throws IOException{
		
	}
	 
}
