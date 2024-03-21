package hilos;

public class T03 extends Thread {
	
	private String mensaje;
	
	public T03(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void run () {
		while(true) {
			System.out.println(mensaje);
		}
	}
	
	public static void main(String[] args) {
		T03 h1 = new T03("Soy el hilo 111111111");
		h1.start();
		T03 h2 = new T03("Soy el hilo 222222222");
		h2.start();
		T03 h3 = new T03("Soy el hilo 333333333");
		h3.start();
	}
	
}
