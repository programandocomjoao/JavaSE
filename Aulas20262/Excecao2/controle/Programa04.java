package controle;

import modelo.Animal;

public class Programa04 {
	public static void main(String[] args) {
		Animal animal = null;
		//Animal animal = new Animal("", "", "");
		
		try {
			animal.setNome("Mel");
			animal.setEspecie("Canina");
			animal.setRaca("Poodle");
			System.out.println("Animal cadastrado com sucesso!");
		}
		catch(NullPointerException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}