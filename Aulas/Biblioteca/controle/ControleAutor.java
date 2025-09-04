package controle;

import java.util.Scanner;

import modelo.Autor;

public class ControleAutor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("CADASTRO DE AUTOR");
		System.out.print("Digite o nome: ");
		String nome = input.nextLine();
		System.out.print("Digite a nacionalidade: ");
		String nacionalidade = input.nextLine();
		
		Autor autor = new Autor();
		
		autor.setNome(nome);
		autor.setNacionalidade(nacionalidade);
				
		System.out.println("AUTOR CADASTRADO");
		System.out.println("Nome: " + autor.getNome());
		System.out.println("Nacionalidade: " + autor.getNacionalidade());
	}
}