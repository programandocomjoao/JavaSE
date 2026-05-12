package controle;

import java.util.Scanner;

import modelo.Funcionario;
import modelo.Vendedor;

public class Programa02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Funcionario funcionario;
		Vendedor vendedor;
		
		System.out.println("CADASTRO DE FUNCIONÁRIO");
		System.out.print("Nome: ");
		String nome = input.nextLine();
		System.out.print("Cargo: ");
		String cargo = input.nextLine();
		System.out.print("Salário: R$ ");
		float salario = input.nextFloat();
		
		if(cargo.compareTo("Vendedor") != 0) {
			funcionario = new Funcionario(nome, cargo, salario);
			System.out.print("Salário Líquido: R$" + funcionario.calcularSalario());
		}
		else {
			System.out.print("Comissão: R$ ");
			float comissao = input.nextFloat();
			vendedor = new Vendedor(nome, cargo, salario, comissao);
			System.out.print("Salário Líquido: R$" + vendedor.calcularSalario());
		}
	}
}