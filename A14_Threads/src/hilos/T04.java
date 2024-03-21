package hilos;

public class T04 implements Runnable{
	
	private String mensaje;
	
	public T04(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void run () {
		while(true) {
			System.out.println(mensaje);
		}
	}
	
	public static void main(String[] args) {
		T04 h1 = new T04("Soy el hilo 111111111");
		Thread t1 = new Thread(h1);
		t1.start();		
		
		T04 h2 = new T04("Soy el hilo 222222222");
		Thread t2 = new Thread(h1);
		t2.start();
		
		T04 h3 = new T04("Soy el hilo 333333333");
		Thread t3 = new Thread(h1);
		t3.start();
	}
	
}
