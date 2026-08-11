package controle;

public class Programa03 {
	public static void main(String[] args) {
		String[] pets = {"Mel", "Sol", "Lua", null, "Betinha", "Suzuki"};
		
		for(int i = 0; i < pets.length; i++)
			try {
				System.out.println(pets[i].toUpperCase());
			}
			catch(NullPointerException e) {
				System.out.println("Erro: " + e.getMessage());
			}
	}
}