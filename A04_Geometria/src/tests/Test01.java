package tests;

import modelo.Figura;

public class Test01 {
	public static void main(String[] args) {
		Figura f;
		f = new Figura();
		f.asignarValores(15.5, -3);
		System.out.println("x: " + f.x);
		System.out.println("y: " + f.y);
		System.out.println(f.area());
	}
}
