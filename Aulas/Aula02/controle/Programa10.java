package controle;

import java.util.Scanner;

public class Programa10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float preco, soma = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("Digite o preço do " + i + "º produto: R$ ");
			preco = input.nextFloat();
			
			while(preco <= 0) {
				System.out.println("PREÇO INVÁLIDO!");
				System.out.print("Digite NOVAMENTE o preço do " + i + "º produto: R$ ");
				preco = input.nextFloat();
			}
			
			soma += preco;
		}
		
		System.out.print("A soma dos preços é R$ " + soma);
	}
}