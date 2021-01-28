package hola;

public class Rectangulo {
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}

	public double getBase() {
		return base;
	}
	
	public void setBase(double nuevabase) {
		this.base=nuevabase;
	}

	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double nuevaaltura) {
		this.altura=nuevaaltura;
	}
	
	
	
	public double CalcularArea() {
		double area;
		area=base*altura;
		return area;
	}
	
	public double CalcularPerimetro() {
		double perimetro;
		perimetro=2*(base+altura);
		return perimetro;
	}
	
}
