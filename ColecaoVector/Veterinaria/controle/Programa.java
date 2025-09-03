package controle;

import java.util.Iterator;
import java.util.Scanner;

import modelo.Animal;
import modelo.Cliente;

public class Programa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char resposta = 'S';
		
		System.out.println("CADASTRO DE CLIENTE");
		System.out.print("CPF: ");
		String cpf = input.nextLine();
		System.out.print("Nome: ");
		String nome = input.nextLine();
		
		Cliente cliente = new Cliente(cpf, nome);
		
		System.out.println("CADASTRO DE ANIMAIS");
		do {
			System.out.print("Nome: ");
			nome = input.nextLine();
			System.out.print("Espécie: ");
			String especie = input.nextLine();
			System.out.print("Raça: ");
			String raca = input.nextLine();
			
			Animal animal = new Animal(nome, especie, raca);
			cliente.addAnimal(animal);
			
			System.out.print("Deseja continuar<S/N>? ");
			resposta = input.next().charAt(0);
			input.nextLine();
		} while(resposta == 'S' || resposta == 's');
		
		System.out.println("ANIMAIS DO CLIENTE " + cliente.getNome());
		
		Iterator iterator = cliente.getAnimais().iterator();
		
		while(iterator.hasNext()) {
			Animal animal = (Animal)iterator.next();
			System.out.print("Nome: " + animal.getNome());
			System.out.print(" | Espécie: " + animal.getEspecie());
			System.out.println(" | Raça: " + animal.getRaca());
		}
	}
}