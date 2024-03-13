package hilos;

public class T02 {
	
	private String mensaje;
	
	public T02(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void run () {
		while(true) {
			System.out.println(mensaje);
		}
	}
	
	public static void main(String[] args) {
		T02 h1 = new T02("Soy el hilo 111111111");
		h1.run();
		T02 h2 = new T02("Soy el hilo 222222222");
		h2.run();
		T02 h3 = new T02("Soy el hilo 333333333");
		h3.run();
	}
	
}
