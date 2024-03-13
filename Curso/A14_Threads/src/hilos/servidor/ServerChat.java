package hilos.servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ServerChat {
	
	private int puerto;
	
	public ServerChat(int puerto) {
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
	
	private class AtiendeCliente extends Thread{
		private Socket socket;
		private BufferedReader in;
		private PrintWriter out;
		private String nick;
		private boolean sesion;
		
		private static Map<String, AtiendeCliente> sala = new ConcurrentHashMap<>();
		private static int cant;
		
		public AtiendeCliente(Socket socket) {
			this.socket = socket;
			start();
		}
		
		public void run() {
			System.out.println("Nuevo cliente conectado");
			
			try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
				PrintWriter pw = new PrintWriter(socket.getOutputStream(), true)){
				
				in = br;
				out = pw;
				
				nuevoCliente();
				
				
				sesion = true;
				String leido;
				
				while(sesion && (leido = in.readLine()) != null) {
					if(leido.length() > 0) {
						switch(leido.charAt(0)) {
						case '-':
							//analizar comando
							comando(leido);
							break;
						case'@':
							//enviar mensaje privado
							mensajePrivado(leido);
							break;
						default:
							//Mensaje de difusion
							difusion(nick + ": " + leido);
							break;					
						}
					}
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		
		private void nuevoCliente() throws IOException {
			out.println("Bienevenido al Nuevo Guasaa");
			
			out.println("Indique su nick:");
			nick = in.readLine();
			
			while(sala.containsKey(nick)){
				out.println("El nick ya existe, por favor, elija otro: ");
				nick = in.readLine();
			}
			
			out.println("Ya estas conectado a la sala");
			sala.put(nick, this);
			cant++;
			
			System.out.println(nick + " se ha incotrporado");
			System.out.println(cant + " usuarios en la sala");
			
			difusion("SRV: " + nick + " se ha incorporado a la sala");
		}
		
		private void difusion(String mje) {
			sala.values().forEach(x -> {if(!(x.nick.equals(this.nick))) x.out.println(mje);});
		}
		
		private void comando(String leido) {
			switch(leido) {
			case "-w":
				sala.keySet().forEach(out::print);
				break;
			case "-q":
				out.println("Hasta la vista Baby!!!");
				sesion = false;
				System.out.println("Cliente desconectado");
				difusion(nick + " se ha desconectado");
				sala.remove(nick);
				cant--;
				break;
			default:
				out.println("comando erroneo");
			case "-h":
				help();
				break;
			
			}
		}
		
		private void mensajePrivado(String leido) {
			if(leido.contains(" ")) {
				String nickDest = leido.substring(1, leido.indexOf(" "));
				String mje = leido.substring(leido.indexOf(" ") + 1);
				if(sala.containsKey(nickDest)) {
					sala.get(nickDest).out.println(nick + " (privado): " + mje);
				}else {
					out.println("SRV: " + nickDest + " no está conectado");
				}
			}else{
				out.println("SVR: Comando incorrecto");
			}
		}
		
		private void help() {
			out.println("Ayuda de Guasaa");
			out.println("-q: salir");
			out.println("-w: usuarios en la sala");
			out.println("-h: esta ayuda");
			out.println("@Usr msj: enviar privado");
		}
	}
	
	public static void main(String[] args) {
		new ServerChat(22);
	}
	
	
}









