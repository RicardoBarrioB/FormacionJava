package streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import streams.excepciones.MiReaderException;

public class S04LeerEntrada {
	
	public static void main(String[] args) throws IOException {
		//String respuesta = leer(System.in);
		//String respuesta = leer(new FileReader("/datos/ContactoDaoMemDinamica.java"));
		String respuesta = leer(new URL("https://www.elmundo.es/index.html").openStream());

		System.out.println(respuesta);
	}
	
	
	public static String leer(Reader r) throws MiReaderException {
		
		StringBuilder resultado = new StringBuilder();
		
		try(BufferedReader br = new BufferedReader(r)){
			
			//br.lines().forEach(l -> resultado.append(l + "\n"));
			br.lines().map(x->x+"\n").forEach(resultado::append);
			
		}catch (IOException e) {
			throw new MiReaderException("Error de lectura");
		}
		return resultado.toString();
	}
	
	public static String leer(InputStream is) throws MiReaderException{
		
		return leer(new InputStreamReader(is));
	}
	
}
