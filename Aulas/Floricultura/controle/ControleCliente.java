package controle;

import java.util.Scanner;

import modelo.Cliente;

public class ControleCliente {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("CADASTRO DE CLIENTE");
		System.out.print("Digite o nome: ");
		String nome = input.nextLine();
		System.out.print("Digite o telefone: ");
		String telefone = input.nextLine();
		
		Cliente cliente = new Cliente(nome, telefone);
		
		System.out.println("CLIENTE CADASTRADO");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Telefone: " + cliente.getTelefone());
	}
}