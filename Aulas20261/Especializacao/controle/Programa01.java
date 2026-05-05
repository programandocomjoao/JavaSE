package controle;

import java.util.Scanner;

import modelo.PessoaFisica;
import modelo.PessoaJuridica;

public class Programa01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PessoaFisica pf = null;
		PessoaJuridica pj = null;
		
		System.out.println("CADASTRO DE CLIENTE");
		System.out.print("CPF/CNPJ: ");
		String id = input.nextLine();
		System.out.print("Nome/Razão Social: ");
		String descricao = input.nextLine();
		System.out.print("Endereço: ");
		String endereco = input.nextLine();
		System.out.print("Whatsapp: ");
		String whatsapp = input.nextLine();
				
		//Cliente cliente = new Cliente(endereco, whatsapp);
		System.out.print("Digite 1 para PF e 2 para PJ: ");
		int pessoa = input.nextInt();
		
		switch(pessoa) {
			case 1: pf = new PessoaFisica(endereco, whatsapp, id, descricao); break;
			case 2: pj = new PessoaJuridica(endereco, whatsapp, id, descricao);
		}
		
		System.out.println("CLIENTE CADASTRADO");
		switch(pessoa) {
			case 1: 
				System.out.println("CPF: " + pf.formatarId());
				System.out.println("Nome: " + pf.getNome());
				System.out.println("Endereço: " + pf.getEndereco());
				System.out.println("Whatsapp: " + pf.getWhatsapp());
				break;
			case 2: 
				System.out.println("CNPJ: " + pj.formatarId());
				System.out.println("Razão Social: " + pj.getRazaoSocial());
				System.out.println("Endereço: " + pj.getEndereco());
				System.out.println("Whatsapp: " + pj.getWhatsapp());
		}
	}
}