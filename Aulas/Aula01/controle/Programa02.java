package controle;

public class Programa02 {
	public static void main(String[] args) {
		String nome;
		int idade;
		float peso, altura;
		char sexo;
		
		nome = "Fernanda";
		idade = 12;
		peso = (float)49.3;
		altura = 1.51f;
		sexo = 'M';
		
		System.out.println("DADOS DO PACIENTE");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso + " / Altura: " + altura);		
		System.out.print("Sexo: " + sexo);
	}
}