package modelo;

public class Circulo extends Figura{
	private double radio;
	
	public Circulo(double x, double y, double radio) {
		super(x,y);
		this.radio = radio;
	}
	
	public double area () {
		return Math.PI*radio*radio;
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Circulo otra = (Circulo) o;
		return this.radio == otra.radio;
	}
	public String toString() {
		return "Circulo[" + this.getX() + ", " + this.getY() + ", " + radio + "]";
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
}
