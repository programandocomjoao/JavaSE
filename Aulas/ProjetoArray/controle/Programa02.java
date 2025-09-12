package controle;

import java.util.Scanner;

public class Programa02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] produtos = {"Arroz", "Feijão", "Macarrão", "Fubá", "Farinha"};
		float[] precos = new float[5];
		
		for(int i = 0; i < produtos.length; i++) {
			System.out.println("PRODUTO " + (i+1));
			System.out.println("NOME: " + produtos[i]);
			System.out.print("PREÇO: R$ ");
			precos[i] = input.nextFloat();
		}
		
		System.out.println("PREÇOS ATUALIZADOS EM 15%");
		for(int i = 0; i < precos.length; i++) {
			System.out.print(produtos[i] + ": de R$ " + precos[i]);
			precos[i] *= 1.15;
			System.out.println(" para R$ " + precos[i]);
		}
	}
}