package controle;

import java.util.Vector;

public class Programa03 {
	public static void main(String[] args) {
		Vector<String> nomes = new Vector<String>();
		
		nomes.add("José");
		nomes.add("Maria");
		nomes.add("Dalira");
		nomes.add("Gerson");
		nomes.add("Ralf");
		nomes.add("Paula");
		System.out.println(nomes);
		
		nomes.add(4, "Augusto");
		System.out.println(nomes);
		
		nomes.setElementAt("Thainá", 3);
		System.out.println(nomes);
		
		nomes.remove("Augusto");
		System.out.println(nomes);
		
		nomes.remove(4);
		System.out.println(nomes);
	}
}