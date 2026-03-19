package controle;

import java.util.Scanner;

import modelo.Gerente;
import modelo.Projeto;

public class Programa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("CADASTRO DE GERENTE");
		System.out.print("Digite o CPF: ");
		String cpf = input.nextLine();
		System.out.print("Digite o nome: ");
		String nome = input.nextLine();
		
		Gerente gerente = new Gerente(cpf, nome);
		
		System.out.println("CADASTRO DE PROJETO");
		System.out.print("Digite o titulo: ");
		String titulo = input.nextLine();
		System.out.print("Digite o prazo: ");
		String prazo = input.nextLine();
		
		Projeto projeto = new Projeto(titulo, prazo);
		
		gerente.setProjeto(projeto);
		projeto.setGerente(gerente);
		
		System.out.println("DADOS DO PROJETO CADASTRADO");
		System.out.println("Título: " + gerente.getProjeto().getTitulo());
		System.out.println("Prazo: " + gerente.getProjeto().getPrazo());
		System.out.println("CPF do gerente: " + projeto.getGerente().getCpf());
		System.out.println("Nome do gerente: " + projeto.getGerente().getNome());
	}
}