package controle;

import java.util.Scanner;

public class Programa03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] nomes = new String[5];
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.print("Digite um nome: ");
			nomes[i] = input.nextLine();
		}
		
		System.out.print("Nomes que começam com a letra M: ");
		for(int i = 0; i < nomes.length; i++)
			if(nomes[i].charAt(0) == 'M')
				System.out.print(nomes[i] + " | ");
		
		System.out.print("\nNomes que possuem mais de 5 letras: ");
		for(int i = 0; i < nomes.length; i++)
			if(nomes[i].length() > 5)
				System.out.print(nomes[i] + " | ");
	}
}