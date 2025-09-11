package modelo;

public class Produto {
	private String descricao, tipo;
	private float preco;
	private int quantidade;
	
	public Produto(String descricao, String tipo, float preco, int quantidade) {
		this.descricao = descricao;
		this.tipo = tipo;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}