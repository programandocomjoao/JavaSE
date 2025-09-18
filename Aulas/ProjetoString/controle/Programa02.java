package controle;

import java.util.Scanner;

public class Programa02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		//String palavra = new String(input.nextLine());
		String palavra = input.nextLine();
		
		int qtd = palavra.length();
		System.out.println("A quantidade de letras é " + qtd);
		
		char prim = palavra.charAt(0);
		System.out.println("A primeira letra é " + prim);
		
		char ultm = palavra.charAt(palavra.length()-1);
		System.out.println("A última letra é " + ultm);
		
		int pos1 = palavra.indexOf('a');
		System.out.println("A primeira posição de 'a' é " + pos1);
		
		int pos2 = palavra.lastIndexOf('a');
		System.out.println("A última posição de 'a' é " + pos2);
		
		String parte = palavra.substring(2, 5);
		System.out.println("A parte entre posições 2 e 5 é " + parte);
		//System.out.println("A parte entre 'a' e 'a' é " + palavra.substring(pos1, pos2));
	
		System.out.println("Em maiúsculas: " + palavra.toUpperCase());
		System.out.println("Em minúsculas: " + palavra.toLowerCase());
		
		if(palavra.compareTo("Sonic") == 0)
			System.out.println(palavra + " é igual a Sonic");
		else if(palavra.compareTo("Sonic") < 0)
			System.out.println(palavra + " vem antes do Sonic");
		else
			System.out.println(palavra + " vem depois do Sonic");
	}
}