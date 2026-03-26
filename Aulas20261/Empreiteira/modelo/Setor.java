package modelo;

public class Setor {
	private String descricao;
	private int ramal;
	private Funcionario[] funcionarios;
	private int i = 0;
	
	public Setor(String descricao, int ramal) {
		this.descricao = descricao;
		this.ramal = ramal;
		funcionarios = new Funcionario[3];
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	public void adFuncionario(Funcionario funcionario) {
		if(i < funcionarios.length) {
			funcionarios[i] = funcionario;
			i++;
			funcionario.setSetor(this);
		}
	}
	
	public void removeFuncionario(Funcionario funcionario) {
		
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
}