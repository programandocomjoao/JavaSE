package modelo;

public class Retangulo implements Poligono {
	private float base, altura;
	
	public Retangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float calcularArea() {
		return base * altura;
	}
}