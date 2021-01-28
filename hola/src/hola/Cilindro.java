package hola;

public class Cilindro {
	private double radio;
	private double altura;
	
	public Cilindro(double radio, double altura) {
		this.radio=radio;
		this.altura=altura;
	}

	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double nuevaradio) {
		this.radio=nuevaradio;
	}

	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double nuevaaltura) {
		this.altura=nuevaaltura;
	}
	
	
	
	public double CalcularArea() {
		double area;
		area=2*Math.PI*radio*(radio+altura);
		return area;
	}
	
	public double CalcularVolumen() {
		double volumen;
		volumen=Math.PI*((radio*radio)*altura);
		return volumen;
	}
	
}
