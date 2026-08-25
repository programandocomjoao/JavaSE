package modelo;

public class Trapezio implements Poligono {
	private float bMaior, bMenor, altura;

	public Trapezio(float bMaior, float bMenor, float altura) {
		this.bMaior = bMaior;
		this.bMenor = bMenor;
		this.altura = altura;
	}

	public float getbMaior() {
		return bMaior;
	}

	public void setbMaior(float bMaior) {
		this.bMaior = bMaior;
	}

	public float getbMenor() {
		return bMenor;
	}

	public void setbMenor(float bMenor) {
		this.bMenor = bMenor;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float calcularArea() {
		float area = ((bMaior + bMenor) * altura) / 2;
		
		return area; 
	}
}