package controle;

import java.util.Vector;

public class Programa01 {
	public static void main(String[] args) {
		Vector pessoa = new Vector();
		
		String nome = "Henrique";
		Integer idade = 30;
		Float altura = 1.73f;
		
		pessoa.add(nome);
		pessoa.add(idade);
		pessoa.add(altura);
		
		System.out.print(pessoa);
	}
}