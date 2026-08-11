package controle;

import java.util.Scanner;

public class Programa02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um nome: ");
		String nome = input.nextLine();
		
		try {
			System.out.println("A 5ª letra é " + nome.charAt(4));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}