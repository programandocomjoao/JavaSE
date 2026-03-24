package controle;

import java.util.Scanner;

import modelo.Contrato;
import modelo.Funcionario;

public class Programa01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("CADASTRO DE FUNCIONÁRIO");
		System.out.print("Digite o CPF: ");
		String cpf = input.nextLine();
		System.out.print("Digite o nome: ");
		String nome = input.nextLine();
		
		Funcionario funcionario = new Funcionario(cpf, nome);
		
		System.out.println("CADASTRO DE CONTRATO");
		System.out.print("Digite o número: ");
		String numero = input.nextLine();
		System.out.print("Digite a data de início: ");
		String inicio = input.nextLine();
		
		Contrato contrato = new Contrato(numero, inicio);
		
		funcionario.setContrato(contrato);
		contrato.setFuncionario(funcionario);
		
		System.out.println("CONTRATAÇÃO CADASTRADA");
		System.out.println("CPF: " + contrato.getFuncionario().getCpf());
		System.out.println("Nome: " + contrato.getFuncionario().getNome());
		System.out.println("Número: " + funcionario.getContrato().getNumero());
		System.out.println("Início: " + funcionario.getContrato().getInicio());
	}
}