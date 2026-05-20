package modelo;

public class Resultado {
	public String situacao;
	private Avaliacao avaliacao;
	
	public Resultado(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getSituacao() {
		return situacao;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	
	public float calcularMedia() {
		avaliacao.media = (avaliacao.getNota1() + avaliacao.getNota2())/2;
		
		if(avaliacao.media >= 6)
			situacao = "Aprovado";
		else
			situacao = "Reprovado";
			
		return avaliacao.media;
	}
}