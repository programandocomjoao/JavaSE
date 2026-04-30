package controle;

import java.util.LinkedList;

public class Programa03 {
	public static void main(String[] args) {
		LinkedList<String> nomes = new LinkedList<String>();
		
		nomes.add("Mariana");
		nomes.add("Gabriel");
		nomes.add("Fernanda");
		nomes.add("Tainá");
		nomes.add("Ísis");
		System.out.println(nomes);
		
		System.out.println("Tamanho da coleção: " + nomes.size());
		System.out.println("Terceiro elemento da coleção: " + nomes.get(2));
		System.out.println("Primeira ocorrência de Gabriel: " + nomes.indexOf("Gabriel"));
		System.out.println("Última ocorrência de Gabriel: " + nomes.lastIndexOf("Gabriel"));
		
		nomes.add(2, "Pedro");
		System.out.println(nomes);
		
		nomes.set(2, "Lucas");
		System.out.println(nomes);
		
		if(nomes.contains("Lucas"))
			System.out.println("Lucas está na coleção!");
		else
			System.out.println("Lucas NÃO está na coleção!");
		
		nomes.remove("Lucas");
		System.out.println(nomes);
		
		if(nomes.contains("Lucas"))
			System.out.println("Lucas está na coleção!");
		else
			System.out.println("Lucas NÃO está na coleção!");
	}
}