package modelo;


public abstract class Figura {
	
	private double x;
	private double y;
	
	public Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	
	public abstract double area();
	public abstract double perimetro();
	
	public boolean equals(Object o) {
		if(o == null) return false;
		if(this == o) return true; 
		if(this.getClass() != o.getClass()) return false;
		Figura otra = (Figura) o;
		return this.x == otra.x && this.y == otra.y;
	}


	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}
	
	
}
