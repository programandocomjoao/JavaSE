package controle;

public class Programa01 {
	public static void main(String[] args) {
		//String[] nomes = new String[5];
		String[] nomes = {"Maria", "Gabriel", "Fernanda", "Tainá", "Alice"};
		
		for(int i = 0; i <= nomes.length; i++)
			try {
				System.out.println(nomes[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro: " + e.getMessage());
			}
	}
}