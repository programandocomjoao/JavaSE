package controle;

import java.util.Scanner;

import modelo.Cliente;
import modelo.PessoaFisica;
import modelo.PessoaJuridica;

public class ControleCliente {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("CADASTRO DE CLIENTE");
		System.out.print("Digite o endereço: ");
		String endereco = input.nextLine();
		System.out.print("Digite o telefone: ");
		String telefone = input.nextLine();
		
		Cliente cliente = null;
		
		System.out.println("1-Pessoa Física\n2-Pessoa Jurídica");
		System.out.print("Digite a opção: ");
		int resposta = input.nextInt();
		
		input.nextLine();
		
		switch(resposta) {
			case 1:
				System.out.print("Digite o CPF: ");
				String cpf = input.nextLine();
				System.out.print("Digite o nome: ");
				String nome = input.nextLine();
				
				cliente = new PessoaFisica(endereco, telefone, cpf, nome);
				break;
			case 2:
				System.out.print("Digite o cnpj: ");
				String cnpj = input.nextLine();
				System.out.print("Digite a razão social: ");
				String razaoSocial = input.nextLine();
				
				cliente = new PessoaJuridica(endereco, telefone, cnpj, razaoSocial);
		}
		
		System.out.println("CLIENTE CADASTRADO");
		System.out.println("Endereço: " + cliente.getEndereco());
		System.out.println("Telefone: " + cliente.getTelefone());
	}
}