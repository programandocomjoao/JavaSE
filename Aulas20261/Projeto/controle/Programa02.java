package controle;

import java.util.Scanner;

import modelo.Funcionario;
import modelo.Setor;

public class Programa02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("CADASTRO DE SETOR");
		System.out.print("Digite a descrição: ");
		String descricao = input.nextLine();
		System.out.print("Digite o ramal: ");
		int ramal = input.nextInt();
		
		Setor setor = new Setor(descricao, ramal);
		
		input.nextLine();
		System.out.println("CADASTRO DE FUNCIONÁRIOS");
		for(int i = 0; i < 3; i++) {
			System.out.print("Digite o CPF: ");
			String cpf = input.nextLine();
			System.out.print("Digite o nome: ");
			String nome = input.nextLine();
			
			Funcionario funcionario = new Funcionario(cpf, nome);
			setor.adFuncionario(funcionario);
		}
	}
}