package modelo;

public class Contrato {
	private String numero, inicio;
	private Funcionario funcionario;

	public Contrato(String numero, String inicio) {
		this.numero = numero;
		this.inicio = inicio;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}