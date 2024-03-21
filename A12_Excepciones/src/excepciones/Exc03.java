package excepciones;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Exc03 {
	
	
	public static void otro() throws IOException, SQLException{
		try {
			problematico(0);
		}catch(FileNotFoundException e) {
			System.out.println("Arreglado el FileNotFound");
		}
	}
	
	public static void opcion2() {
		try {
			problematico(55);
			
		}catch(SQLException e) {
			System.out.println("Arreglar SQL");
		} catch(FileNotFoundException e) {
			System.out.println("Arreglar FileNotFound");
		} catch(IOException e) {
			System.out.println("Arreglar IOE");
		}
	}
	
	public static void opcion3() {
		try {
			problematico(55);
			
		}catch(SQLException e) {
			System.out.println("Arreglar SQL");
		} catch(IOException e) {
			System.out.println("Arreglar FileNotFound e IOE");
		}
	}
	
	public static void opcion4() {
		try {
			problematico(55);
			
		}catch(Exception e) {
			System.out.println("Soluciona las 3");
		}
	}
	
	public static void opcion5() {
		try {
			problematico(55);
			
		}catch(SQLException | IOException e) {
			System.out.println("Soluciona las 3");
		}
	}
	
	
	
	static void problematico(int num) throws FileNotFoundException, IOException, SQLException{
		if(num == 1) {
			throw new FileNotFoundException();
		}else if(num == 2) {
			throw new IOException();
		}else if(num == 3) {
			throw new SQLException();
		}
	}
}
