package controle;

import java.util.Iterator;
import java.util.Vector;

import dominio.Animal;

public class Programa03 {
	public static void main(String[] args) {
		Vector<Animal> animais = new Vector<Animal>();
		
		animais.add(new Animal("Betinha", "Canina", "Street Dog"));
		animais.add(new Animal("Pachola", "Canina", "Street Dog"));
		animais.add(new Animal("Mel", "Canina", "Poodle"));
		animais.add(new Animal("Luana", "Canina", "Street Dog"));
		animais.add(new Animal("Solange", "Canina", "Street Dog"));
		animais.add(new Animal("Suzuki", "Canina", "Street Dog"));
		
		//System.out.println(animais);
		//Iterator iterator2 = animais.iterator();
		//while(iterator2.hasNext()) {
		//	Animal animal = (Animal)iterator2.next();
			
		//	if(animal.getRaca().compareTo("Street Dog") == 0)
		//		animal.setRaca("Vira Lata");
		//}
		
		Iterator iterator = animais.iterator();
		while(iterator.hasNext()) {
			Animal animal = (Animal)iterator.next();
			System.out.println(animal.getNome() + " | " + animal.getEspecie() + " | " + animal.getRaca());
		}
	}
}