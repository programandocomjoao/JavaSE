package controle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Digite um número: ");
			int n1 = input.nextInt();
			System.out.print("Digite outro número: ");
			int n2 = input.nextInt();
			
			System.out.println("SOMA: " + (n1+n2));
		}
		catch(InputMismatchException e) {
			System.out.println("Erro: " + e.getMessage());
			System.out.println("Só pode digitar números inteiros!");
		}
	}
}