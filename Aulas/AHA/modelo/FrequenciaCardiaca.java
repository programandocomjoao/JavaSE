package modelo;

import java.util.Calendar;

public class FrequenciaCardiaca {
	private String nome, sobrenome;
	private int dia, mes, ano;
	
	public FrequenciaCardiaca(String nome, String sobrenome, int dia, int mes, int ano) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	public String informarNome() {
		return nome + " " + sobrenome;
	}
	
	public int calcularIdade() {
		Calendar calendar = Calendar.getInstance();
		int ano = calendar.get(Calendar.YEAR);
		int mes = calendar.get(Calendar.MONTH) + 1;
		int dia = calendar.get(Calendar.DAY_OF_MONTH);
		int idade = ano - this.ano;
		
		if(mes < this.mes || (mes == this.mes && dia < this.dia))
			idade--;
		
		return idade;
	}
	
	public int calcularFCM() {
		return 220 - calcularIdade();
	}
	
	public float calcularFCA() {
		return calcularFCM() * 0.85f - calcularFCM() * 0.5f;
	}
}