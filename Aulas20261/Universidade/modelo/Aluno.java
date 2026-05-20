package modelo;

public class Aluno {
	private String matricula, nome;
	private static Aluno[] alunos;
	private static int cont;
	
	static {
		Aluno.cont = 0;
		Aluno.alunos = new Aluno[100];
	}

	public Aluno(String matricula, String nome) {
		Aluno.alunos[Aluno.cont++] = this;
		this.matricula = matricula;
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static Aluno[] getAlunos() {
		return alunos;
	}

	public static int getCont() {
		return cont;
	}
}