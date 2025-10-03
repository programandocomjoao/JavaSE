package controle;

import java.util.Scanner;

import modelo.Funcionario;
import modelo.Vendedor;

public class ControleFuncionario {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("CADASTRO DE FUNCIONÁRIO");
		System.out.print("Digite a matrícula: ");
		String matricula = input.nextLine();
		System.out.print("Digite o nome: ");
		String nome = input.nextLine();
		System.out.print("Digite o salário: R$ ");
		float salario = input.nextFloat();
		
		System.out.print("É vendedor? <S/N>: ");
		char resposta = input.next().charAt(0);
		
		Funcionario funcionario = null;
		
		if(resposta == 'S' || resposta == 's') {
			float comissao = 300f;
			funcionario = new Vendedor(matricula, nome, salario, comissao);
		}
		else
			funcionario = new Funcionario(matricula, nome, salario);
		
		System.out.println("FUNCIONÁRIO CADASTRADO");
		System.out.println("Matrícula: " + funcionario.getMatricula());
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Salário Líquido: " + funcionario.calcularSalario());
	}
}