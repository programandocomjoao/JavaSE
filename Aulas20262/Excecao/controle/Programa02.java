package controle;

import java.util.Scanner;

public class Programa02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n1 = input.nextInt();
		System.out.print("Digite outro número: ");
		int n2 = input.nextInt();
		
		try {
			System.out.println("A divisão é " + (n1/n2));
		}
		catch(ArithmeticException e) {
			System.out.println("Não é possível dividir por zero!");
			System.out.println("Erro: " + e.getMessage());
		}
		
		System.out.print("***** FIM DE PROGRAMA *****");
	}
}