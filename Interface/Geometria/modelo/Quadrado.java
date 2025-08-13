package modelo;

public class Quadrado implements Poligono {
	private float lado;

	public Quadrado(float lado) {
		this.lado = lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	public float calcularArea() {
		return lado * lado;
	}
}