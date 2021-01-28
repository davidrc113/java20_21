package hola;

public class Circulo {
	private double radio;
	
	public Circulo(double radio) {
		this.radio=radio;
	}

	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double nuevoradio) {
		this.radio=nuevoradio;
	}
	
	public double CalcularArea() {
		double area;
		area=Math.PI*radio;
		return area;
	}
	
	public double CalcularPerimetro() {
		double perimetro;
		perimetro=2*Math.PI*radio;
		return perimetro;
	}
	
}
