package controle;

import java.util.Scanner;

public class Programa04 {
	// Método iterativo
	public static String inverterIterativo(String palavra) {
		String invertida = "";
		
		for(int i = palavra.length()-1; i >= 0; i--)
			invertida += palavra.charAt(i);
		
		return invertida;
	}
	
	// Método recursivo
	public static String inverterRecursivo(String palavra) {
		if(palavra.length() <= 1)
			return palavra;
		
		return palavra.charAt(palavra.length()-1) + 
				inverterRecursivo(palavra.substring(0, palavra.length()-1));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String palavra = input.nextLine();

		System.out.println("Invertida iterativa: " + inverterIterativo(palavra));
		System.out.println("Invertida recursiva: " + inverterRecursivo(palavra));
	}
}