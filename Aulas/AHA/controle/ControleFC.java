package controle;

import java.util.Scanner;

import modelo.FrequenciaCardiaca;

public class ControleFC {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("CADASTRO DE ATLETA");
		System.out.print("Digite o nome: ");
		String nome = input.nextLine();
		System.out.print("Digite o sobrenome: ");
		String sobrenome = input.nextLine();
		System.out.print("Digite o dia de nascimento: ");
		int dia = input.nextInt();
		System.out.print("Digite o mês de nascimento: ");
		int mes = input.nextInt();
		System.out.print("Digite o ano de nascimento: ");
		int ano = input.nextInt();
		
		FrequenciaCardiaca fc = new FrequenciaCardiaca(nome, sobrenome, dia, mes, ano);
		
		System.out.println("ATLETA CADASTRADO");
		System.out.println("Nome: " + fc.informarNome());
		System.out.println("Idade: " + fc.calcularIdade());
		System.out.println("FCM: " + fc.calcularFCM());
		System.out.println("FCA: " + fc.calcularFCA());
	}
}