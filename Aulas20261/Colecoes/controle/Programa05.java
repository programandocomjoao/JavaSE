package controle;

import java.util.ArrayList;
import java.util.Iterator;

import modelo.Animal;

public class Programa05 {
	public static void main(String[] args) {
		ArrayList<Animal> animais = new ArrayList<Animal>();
		
		animais.add(new Animal("Luana", "Street Dog"));
		animais.add(new Animal("Solange", "Street Dog"));
		animais.add(new Animal("Mel", "Poodle"));
		animais.add(new Animal("Betinha", "Street Dog"));
		animais.add(new Animal("Jurema", "Jabuti"));
		
		System.out.println("LISTA DE ANIMAIS");
		
		Iterator it = animais.iterator();		
		while(it.hasNext()) {
			Animal animal = (Animal)it.next();			
			System.out.println(animal.getNome() + " | " + animal.getRaca());
		}
	}
}