package controle;

import java.util.Vector;

public class Programa01 {
	public static void main(String[] args) {
		Vector pessoa = new Vector();
		
		String nome = "Fernanda";
		int idade = 13;
		float altura = 1.57f;
		
		pessoa.add(nome);
		pessoa.add(idade);
		pessoa.add(altura);
		
		System.out.println("DADOS DA PESSOA");
		System.out.println("Nome: " + pessoa.get(0));
		System.out.println("Idade: " + pessoa.get(1));
		System.out.println("Altura: " + pessoa.get(2));
	}
}