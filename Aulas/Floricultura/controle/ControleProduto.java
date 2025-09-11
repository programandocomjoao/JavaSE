package controle;

import java.util.Scanner;

import modelo.Produto;

public class ControleProduto {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("CADASTRO DE PRODUTO");
		System.out.print("Digite a descrição: ");
		String descricao = input.nextLine();
		System.out.print("Digite o tipo: ");
		String tipo = input.nextLine();
		System.out.print("Digite o preço: R$ ");
		float preco = input.nextFloat();
		System.out.print("Digite a quantidade: ");
		int quantidade = input.nextInt();
		
		Produto produto = new Produto(descricao, tipo, preco, quantidade);
		
		System.out.println("PRODUTO CADASTRADO");
		System.out.println("Descrição: " + produto.getDescricao());
		System.out.println("Tipo: " + produto.getTipo());
		System.out.println("Preço: R$ " + produto.getPreco());
		System.out.println("Quantidade: " + produto.getQuantidade());
	}
}