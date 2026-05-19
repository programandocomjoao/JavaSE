package controle;

import java.util.Scanner;

import modelo.Cliente;

public class Programa01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("CADASTRO DE CLIENTE");
		System.out.print("CPF: ");
		String cpf = input.nextLine();
		System.out.print("Nome: ");
		String nome = input.nextLine();
		
		Cliente cliente = new Cliente(cpf, nome);
		
		System.out.println("CADASTRO DO IMÓVEL 1");
		System.out.print("Rua: ");
		String rua = input.nextLine();
		System.out.print("Número: ");
		String numero = input.nextLine();
		System.out.print("Bairro: ");
		String bairro = input.nextLine();
		System.out.print("Cidade: ");
		String cidade = input.nextLine();
		
		Cliente.Imovel imovel1 = cliente.new Imovel(rua, numero, bairro, cidade);
		
		System.out.println("CADASTRO DO IMÓVEL 2");
		System.out.print("Rua: ");
		rua = input.nextLine();
		System.out.print("Número: ");
		numero = input.nextLine();
		System.out.print("Bairro: ");
		bairro = input.nextLine();
		System.out.print("Cidade: ");
		cidade = input.nextLine();
		
		Cliente.Imovel imovel2 = cliente.new Imovel(rua, numero, bairro, cidade);
		
		System.out.println("Imóveis do Cliente " + cliente.getNome());
		System.out.println("Imóvel 1: " + imovel1.getRua() + ", " + imovel1.getNumero() + 
						   "," + imovel1.getBairro() + ", " + imovel1.getCidade());
		System.out.println("Imóvel 2: " + imovel2.getRua() + ", " + imovel2.getNumero() + 
				   "," + imovel2.getBairro() + ", " + imovel2.getCidade());
	}
}