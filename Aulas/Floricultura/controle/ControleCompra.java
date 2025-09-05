package controle;

import java.util.Scanner;

import modelo.Compra;

public class ControleCompra {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Compra compra = new Compra();
		
		System.out.println("REGISTRO DE NOVA COMPRA");
		System.out.println("Data: " + compra.getData());
		System.out.print("Digite o valor: R$ ");
		compra.setValor(input.nextFloat());
		
		System.out.println("COMPRA REGISTRADA");
		System.out.println("Data: " + compra.getData());
		System.out.println("Valor: R$ " + compra.getValor());
	}
}