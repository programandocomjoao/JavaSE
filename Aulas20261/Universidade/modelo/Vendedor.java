package modelo;

public class Vendedor extends Funcionario {
	private float comissao;

	public Vendedor(String nome, String cargo, float salario, float comissao) {
		super(nome, cargo, salario);
		this.comissao = comissao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public float calcularSalario() {
		return this.comissao + super.calcularSalario();
	}
}