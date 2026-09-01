package controle;

import java.util.Scanner;

import modelo.Apartamento;
import modelo.Vaga;

public class Programa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("CADASTRO DE CONDÔMINO");
		System.out.print("Andar: ");
		int andar = input.nextInt();
		System.out.print("Número do apartamento: ");
		int numAp = input.nextInt();
		System.out.print("Bloco da vaga: ");
		char bloco = input.next().charAt(0);
		System.out.print("Número da vaga: ");
		int numVaga = input.nextInt();
		
		Apartamento apartamento = new Apartamento(andar, numAp);
		Vaga vaga = new Vaga(bloco, numVaga);
		
		apartamento.setVaga(vaga);
		vaga.setApartamento(apartamento);
		
		System.out.println("CONDÔMINO CADASTRADO");
		System.out.println("Apartamento: " + vaga.getApartamento().getNumero());
		System.out.println("Vaga: " + apartamento.getVaga().getNumero());
	}
}