package controle;

import java.util.Scanner;

import excecoes.RaizQuadradaException;

public class Programa01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		float n = input.nextFloat();
		
		try {
			System.out.print("Raiz quadrada: " + Operacoes.calcularRaiz(n));
		}
		catch(RaizQuadradaException e) {
			System.out.print("Erro: " + e.getMessage());
		}
	}
}