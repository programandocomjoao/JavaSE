package controle;

import java.util.Scanner;

public class Programa04 {
	public static void main(String[] args) {
		String nome;
		int idade;
		float peso, altura;
		char sexo;

		//Scanner input;
		//input = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		System.out.println("CADASTRO DE PACIENTE");
		System.out.print("Digite o nome: ");
		nome = input.nextLine();
		System.out.print("Digite a idade: ");
		idade = input.nextInt();
		System.out.print("Digite o peso: ");
		peso = input.nextFloat();
		System.out.print("Digite a altura: ");
		altura = input.nextFloat();
		System.out.print("Digite o sexo<M/F>: ");
		sexo = input.next().charAt(0);
		
		System.out.println("DADOS DO PACIENTE");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso + " / Altura: " + altura);		
		System.out.print("Sexo: " + sexo);
	}
}