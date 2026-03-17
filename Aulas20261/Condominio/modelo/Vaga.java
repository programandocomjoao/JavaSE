package modelo;

public class Vaga {
	private char bloco;
	private int numero;
	private Apartamento apartamento;
		
	public Vaga(char bloco, int numero) {
		this.bloco = bloco;
		this.numero = numero;
	}
	
	public char getBloco() {
		return bloco;
	}
	
	public void setBloco(char bloco) {
		this.bloco = bloco;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Apartamento getApartamento() {
		return apartamento;
	}

	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}	
}