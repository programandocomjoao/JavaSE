package controle;

import java.util.Scanner;

import modelo.PessoaFisica;
import modelo.PessoaJuridica;

public class Programa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("CADASTRO DE CLIENTE");
		System.out.print("Endereço: ");
		String endereco = input.nextLine();
		System.out.print("Telefone: ");
		String telefone = input.nextLine();
		System.out.print("Digite o CPF/CNPJ: ");
		String id = input.nextLine();
		System.out.print("Digite o nome/razão social: ");
		String descricao = input.nextLine();
		
		if(id.length() == 11) {
			PessoaFisica pf = new PessoaFisica(endereco, telefone, id, descricao);
			
			System.out.println("CLIENTE CADASTRADO");
			System.out.println("CPF: " + pf.formatarId());
			System.out.println("Nome: " + pf.getNome());
			System.out.println("Endereço: " + pf.getEndereco());
			System.out.println("Telefone: " + pf.formatarTelefone());
		}
		else {
			PessoaJuridica pj = new PessoaJuridica(endereco, telefone, id, descricao);
			
			System.out.println("CLIENTE CADASTRADO");
			System.out.println("CNPJ: " + pj.formatarId());
			System.out.println("Razão Social: " + pj.getRazaoSocial());
			System.out.println("Endereço: " + pj.getEndereco());
			System.out.println("Telefone: " + pj.formatarTelefone());
		}
	}
}