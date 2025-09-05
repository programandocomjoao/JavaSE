package controle;

import java.util.Scanner;

import modelo.Categoria;

public class ControleCategoria {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Categoria categoria = new Categoria();
		
		System.out.println("CADASTRO DE CATEGORIA");
		System.out.print("Digite a descrição da categoria " + categoria.getCodigo() + ": ");
		categoria.setDescricao(input.nextLine());
		
		System.out.println("CATEGORIA CADASTRADA");
		System.out.println("Código: " + categoria.getCodigo());
		System.out.println("Descrição: " + categoria.getDescricao());
	}
}