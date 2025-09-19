package modelo;

public class Cliente {
	private String nome, cpf, data;

	public Cliente(String nome, String cpf, String data) {
		this.nome = nome;
		this.cpf = cpf;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public String formatarData() {
		String dia = data.substring(0, 2);
		String mes = data.substring(2, 4);
		String ano = data.substring(4, 8);
		
		return dia + "/" + mes + "/" + ano;
	}
	
	public String formatarCpf() {
		String d1 = cpf.substring(0, 3);
		String d2 = cpf.substring(3, 6);
		String d3 = cpf.substring(6, 9);
		String dv = cpf.substring(9, 11);
		
		return d1 + "." + d2 + "." + d3 + "-" + dv;
	}
}