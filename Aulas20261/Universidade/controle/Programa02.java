package controle;

import java.util.Scanner;

import modelo.Avaliacao;
import modelo.Resultado;

public class Programa02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("CÁLCULO DO RESULTADO");
		System.out.print("Aluno: ");
		String nome = input.nextLine();
		System.out.print("Nota 1: ");
		float nota1 = input.nextFloat();
		System.out.print("Nota 2: ");
		float nota2 = input.nextFloat();
		
		Avaliacao avaliacao = new Avaliacao(nota1, nota2);
		Resultado resultado = new Resultado(avaliacao);
		
		System.out.println("Média: " + resultado.calcularMedia());
		System.out.print("Situação: " + resultado.situacao);
	}
}