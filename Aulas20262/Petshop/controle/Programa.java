package controle;

import java.util.Scanner;

import modelo.Animal;
import modelo.Cliente;

public class Programa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("CADASTRO DE CLIENTE");
		System.out.print("CPF: ");
		String cpf = input.nextLine();
		System.out.print("Nome: ");
		String nome = input.nextLine();
		
		Cliente cliente = new Cliente(cpf, nome);
		
		System.out.println("CADASTRO DE ANIMAIS");
		for(int i = 0; i < 3; i++) {
			System.out.println("ANIMAL " + (i+1) + ": ");
			System.out.print("Nome: ");
			String nomePet = input.nextLine();
			System.out.print("Raça: ");
			String raca = input.nextLine();
			
			Animal animal = new Animal(nomePet, raca);
			cliente.adAnimal(animal);
		}
		
		System.out.println("ANIMAIS DO CLIENTE " + cliente.getNome());
		for(Animal a : cliente.getAnimais())
			System.out.println(a.getNome() + " | " + a.getRaca());
	}
}