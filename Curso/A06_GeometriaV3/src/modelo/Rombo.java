package modelo;

public class Rombo extends Figura {
	
	private double dMenor;
	private double dMayor;
	
	public Rombo(double x, double y, double dMenor, double dMayor) {
		super(x, y);
		this.dMenor = dMenor;
		this.dMayor = dMayor;
	}

	public double getdMenor() {
		return dMenor;
	}

	public void setdMenor(double dMenor) {
		this.dMenor = dMenor;
	}

	public double getdMayor() {
		return dMayor;
	}

	public void setdMayor(double dMayor) {
		this.dMayor = dMayor;
	}
	
	public double perimetro() {
		return 4*Math.sqrt(Math.pow(dMayor, 2) + Math.pow(dMenor, 2));
	}
	public double area() {
		return (dMayor*dMenor)/2;
	}
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Rombo otro = (Rombo) o;
		return this.dMenor == otro.dMenor && this.dMayor == otro.dMayor;
	}
	public String toString() {
		return "Rombo[" + this.getX() + ", " + this.getY() + ", " + dMayor + ", " + dMenor + "]";
	}
	
}
