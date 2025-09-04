package controle;

import java.util.Scanner;
import modelo.Livro;

public class ControleLivro {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("CADASTRO DE LIVRO");
		System.out.print("Digite o ISBN: ");
		String isbn = input.nextLine();
		System.out.print("Digite o título: ");
		String titulo = input.nextLine();
		System.out.print("Digite o ano: ");
		int ano = input.nextInt();
		
		Livro livro = new Livro();
		
		livro.inserir(isbn, titulo, ano);
		System.out.print("Livro: " + livro.consultar());
	}
}