package controle;

import java.util.Vector;

public class Programa01 {
	public static void main(String[] args) {
		Vector pessoa = new Vector();
		
		String nome = "Fernanda";
		Integer idade = 13;
		Float altura = 1.43f;
		
		pessoa.add(nome);
		pessoa.add(idade);
		pessoa.add(altura);
		
		System.out.println(pessoa);
	}
}