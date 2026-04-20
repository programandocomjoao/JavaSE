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
		
		System.out.println(nomes);
		System.out.println("Tamanho da coleção: " + nomes.size());
		System.out.println("Primeiro elemento: " + nomes.firstElement());
		System.out.println("Último elemento: " + nomes.lastElement());
		System.out.println("Terceiro elemento: " + nomes.get(2));
		System.out.println("Primeira posição de Gabriel: " + nomes.indexOf("Gabriel"));
		System.out.println("Última posição de Gabriel: " + nomes.lastIndexOf("Gabriel"));
		//System.out.println("Existe Fernanda na coleção: " + nomes.contains("Fernanda"));
		//System.out.println("Existe Dimitri na coleção: " + nomes.contains("Dimitri"));
		
		if(nomes.contains("Fernanda"))
			System.out.println("Fernanda está na coleção");
		else
			System.out.println("Fernanda não está na coleção");
		
		if(nomes.contains("Dimitri"))
			System.out.println("Dimitri está na coleção");
		else
			System.out.println("Dimitri não está na coleção");
		
		System.out.println(nomes);
		
		nomes.add(4, "Ísis");
		System.out.println(nomes);
		
		nomes.setElementAt("José", 3);
		System.out.println(nomes);
		
		nomes.remove("José");
		System.out.println(nomes);
	}
}