package controle;

import java.util.Vector;

public class Programa02 {
	public static void main(String[] args) {
		Vector<String> nomes = new Vector<String>();
		
		nomes.add("Maria");
		nomes.add("João");
		nomes.add("Mariana");
		nomes.add("Gabriel");
		nomes.add("João");
		nomes.add("Fernanda");
				
		System.out.println(nomes);
		System.out.println("Tamanho da coleção: " + nomes.size());
		System.out.println("Primeiro nome: " + nomes.firstElement());
		System.out.println("Último nome: " + nomes.lastElement());
		System.out.println("Terceiro nome: " + nomes.get(2));
		System.out.println("Primeira posição de João: " + nomes.indexOf("João"));
		System.out.println("Última posição de João: " + nomes.lastIndexOf("João"));
		System.out.println("Fernanda está na coleção: " + nomes.contains("Fernanda"));
		System.out.println("Pedro está na coleção: " + nomes.contains("Pedro"));
	}
}