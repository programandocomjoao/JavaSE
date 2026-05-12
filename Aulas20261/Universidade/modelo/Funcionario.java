package modelo;

public class Funcionario /* extends Object */ {
	private String nome, cargo;
	private float salario;
	
	public Funcionario(String nome, String cargo, float salario) {
		// super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float calcularSalario() {
		float inss = salario * 0.14f;
		float riocard = salario * 0.06f;
		
		return salario - inss - riocard;
	}
}