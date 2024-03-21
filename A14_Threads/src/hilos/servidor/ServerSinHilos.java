package hilos.servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSinHilos {
	
	private int puerto;
	
	public ServerSinHilos(int puerto) {
		this.puerto = puerto;
		iniciar();
	}
	
	private void iniciar() {
		
		try(ServerSocket server = new ServerSocket(puerto)){
			System.out.println("Servidor arrancado en el puerto " + puerto);
			System.out.println("Esperando conexiones...");
			while(true) {
				Socket cliente = server.accept();
				new AtiendeCliente(cliente);
			}			
			
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("No se pudo abrir el puerto " + puerto);;
		}
	}
	
	private class AtiendeCliente{
		private Socket socket;
		
		public AtiendeCliente(Socket socket) {
			this.socket = socket;
			atiende();
		}
		
		private void atiende() {
			System.out.println("Nuevo cliente conectado");
			
			try(BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true)){
				
				out.println("Bienevenido al Server Tontaco!!!");
				
				boolean sesion = true;
				String leido;
				while(sesion && (leido = in.readLine()) != null) {
					out.println("SRV: " + leido);
					
					if(leido.equals("-q")) {
						out.println("Hasta la vista Baby!!!");
						sesion = false;
						System.out.println("Cliente desconectado");
					}
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		
	}
	
	public static void main(String[] args) {
		new ServerSinHilos(22);
	}
	
	
}









