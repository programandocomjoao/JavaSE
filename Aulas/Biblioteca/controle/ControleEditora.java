package controle;

import java.util.Scanner;

import modelo.Editora;

public class ControleEditora {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("CADASTRO DE EDITORA");
		System.out.print("Digite o CNPJ: ");
		String cnpj = input.nextLine();
		System.out.print("Digite a razão social: ");
		String razaoSocial = input.nextLine();
		System.out.print("Digite o país: ");
		String pais = input.nextLine();
		
		Editora editora = new Editora();
		
		editora.setCnpj(cnpj);
		editora.setRazaoSocial(razaoSocial);
		editora.setPais(pais);
		
		System.out.println("EDITORA CADASTRADA");
		System.out.println("CNPJ: " + editora.getCnpj());
		System.out.println("Razão Social: " + editora.getRazaoSocial());
		System.out.println("País: " + editora.getPais());
	}
}