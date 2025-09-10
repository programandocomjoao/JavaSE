package controle;

import java.util.ArrayList;

public class Programa02 {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("José");
		nomes.add("Maria");
		nomes.add("Ralf");
		nomes.add("Raquel");
		nomes.add("Gerson");		
		System.out.println(nomes);
		
		nomes.add(2, "Mariana");
		System.out.println(nomes);
		
		nomes.set(3, "Gabriel");
		System.out.println(nomes);
		
		System.out.println("Primeiro nome: " + nomes.get(0));
		System.out.println("Último nome: " + nomes.get(nomes.size()-1));
		
		if(nomes.contains("Maria"))
			System.out.println("Maria existe na coleção!");
		else
			System.out.println("Maria não existe na coleção!");
		
		nomes.remove("Maria");
		
		if(nomes.contains("Maria"))
			System.out.println("Maria existe na coleção!");
		else
			System.out.println("Maria não existe na coleção!");
	}
}