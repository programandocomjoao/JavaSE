package modelo;

public class Trapezio implements Poligono {
	private float baseMaior, baseMenor, altura;

	public Trapezio(float baseMaior, float baseMenor, float altura) {
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}

	public float getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(float baseMaior) {
		this.baseMaior = baseMaior;
	}

	public float getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(float baseMenor) {
		this.baseMenor = baseMenor;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float calcularArea() {
		return (baseMaior + baseMenor) * altura /2;
	}
}