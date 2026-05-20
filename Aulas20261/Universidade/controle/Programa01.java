package controle;

import java.util.Scanner;

import modelo.Aluno;

public class Programa01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Aluno aluno;
		char resposta;
		
		System.out.println("CADASTRO DE ALUNOS");
		do {
			System.out.print("Matrícula: ");
			String matricula = input.nextLine();
			System.out.print("Nome: ");
			String nome = input.nextLine();
			
			aluno = new Aluno(matricula, nome);
			
			System.out.print("Deseja continuar? <S/N>: ");
			resposta = input.next().charAt(0);
			input.nextLine();
		} while(resposta == 'S' || resposta == 's');
		
		System.out.println("Foram " + aluno.getCont() + " alunos cadastrados:");
		for(int i = 0; i < aluno.getCont(); i++)
			System.out.println(aluno.getAlunos()[i].getMatricula() + " | " +
					           aluno.getAlunos()[i].getNome());
	}
}