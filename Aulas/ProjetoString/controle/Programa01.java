package controle;

public class Programa01 {
	public static void main(String[] args) {
		//String nome = new String("Maria");
		String nome = "Maria";
		
		System.out.println("Nome: " + nome);
		System.out.println("Quantidade de letras: " + nome.length());
		System.out.println("Primeira letra: " + nome.charAt(0));
		System.out.println("Última letra: " + nome.charAt(4));
	}
}