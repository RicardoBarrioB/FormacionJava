package hilos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;

import javax.swing.JFrame;

public class T01Ventana extends JFrame{
	
	public T01Ventana() {
		setBounds(100,100, 400, 600);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		T01Ventana v = new T01Ventana();
		int algo = 0;
		while(true) {
			for (int i = 0; i < 10_000_000; i++);			
			System.out.println(++algo);
		}
	}
}












