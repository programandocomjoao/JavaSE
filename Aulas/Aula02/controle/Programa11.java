package controle;

import java.util.Scanner;

public class Programa11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float preco, soma = 0;
		
		for(int i = 1; i <= 10; i++) {
			do {
				System.out.print("Digite o preço do " + i + "º produto: R$ ");
				preco = input.nextFloat();
				
				if(preco <= 0)
					System.out.println("PREÇO INVÁLIDO!");
			}	while(preco <= 0);
			
			soma += preco;
		}
		
		System.out.print("A soma dos preços é R$ " + soma);
	}
}