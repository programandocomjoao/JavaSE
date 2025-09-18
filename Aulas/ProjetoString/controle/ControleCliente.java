package controle;

import java.util.Scanner;

import modelo.Cliente;

public class ControleCliente {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("CADASTRO DE CLIENTE");
		System.out.print("Digite o nome: ");
		String nome = input.nextLine();
		System.out.print("Digite o CPF(somente números): ");
		String cpf = input.nextLine();
		System.out.print("Digite a data nasc(somente números): ");
		String data = input.nextLine();
		
		Cliente cliente = new Cliente(nome, cpf, data);
		
		System.out.println("CLIENTE CADASTRADO");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.formatarCpf());
		System.out.println("Data Nasc: " + cliente.formatarData());
	}
}