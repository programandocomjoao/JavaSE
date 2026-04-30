package controle;

import java.util.ArrayList;

public class Programa04 {
	public static void main(String[] args) {
		ArrayList<String> games = new ArrayList<String>();
		
		games.add("Super Mario Bros");
		games.add("Sonic The Hedgehog");
		games.add("Double Dragon");
		games.add("Donkey Kong");
		games.add("Legend of Zelda");
		System.out.println(games);
		
		games.add(2, "Yo!Noid");
		System.out.println(games);
		
		games.set(2, "Castlevania");
		System.out.println(games);
		
		System.out.println("Double Dragon está na coleção: " + games.contains("Double Dragon"));
		games.remove("Double Dragon");
		System.out.println("Double Dragon está na coleção: " + games.contains("Double Dragon"));
		
		System.out.println(games);
		System.out.println("Tamanho da coleção: " + games.size());
	}
}