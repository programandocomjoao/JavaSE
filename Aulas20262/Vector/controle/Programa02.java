package controle;

import java.util.Vector;

public class Programa02 {
	public static void main(String[] args) {
		Vector<String> nomes = new Vector<String>();

		nomes.add("Maria");
		nomes.add("João");
		nomes.add("Mariana");
		nomes.add("Gabriel");
		nomes.add("Fernanda");
		nomes.add("Tainá");
		nomes.add("Alice");
		
		System.out.println(nomes);
		System.out.println("Tamanho: " + nomes.size());
		System.out.println("Primeiro nome: " + nomes.firstElement());
		System.out.println("Último nome: " + nomes.lastElement());
	}
}