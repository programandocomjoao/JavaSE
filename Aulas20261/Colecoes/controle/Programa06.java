package controle;

import java.util.ArrayList;
import java.util.Iterator;

import modelo.Animal;

public class Programa06 {
	public static void main(String[] args) {
		ArrayList<Animal> animais = new ArrayList<Animal>();
		
		animais.add(new Animal("Coração", "Street Dog"));
		animais.add(new Animal("Suzuki", "Street Dog"));
		animais.add(new Animal("Pachola", "Street Dog"));
		animais.add(new Animal("Botafogo", "Street Cat"));
		animais.add(new Animal("Penélope", "Street Cat"));
		
		System.out.println("LISTA DE ANIMAIS");
		
		for(Animal animal : animais)
			System.out.println(animal.getNome() + " | " + animal.getRaca());
	}
}