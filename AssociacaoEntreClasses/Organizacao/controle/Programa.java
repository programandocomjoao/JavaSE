package controle;

import java.util.Scanner;

import modelo.Gerente;
import modelo.Setor;

public class Programa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("CADASTRO DO SETOR");
		System.out.print("Digite a sigla: ");
		String sigla = input.nextLine();
		System.out.print("Digite a descrição: ");
		String descricao = input.nextLine();
		
		System.out.println("CADASTRO DO GERENTE");
		System.out.print("Digite o CPF: ");
		String cpf = input.nextLine();
		System.out.print("Digite o nome: ");
		String nome = input.nextLine();
		
		Setor setor = new Setor(sigla, descricao);
		Gerente gerente = new Gerente(cpf, nome);
		
		setor.setGerente(gerente);
		gerente.setSetor(setor);
		
		System.out.println("O funcionário " + setor.getGerente().getNome() +
				" é gerente do setor " + gerente.getSetor().getDescricao());
	}
}