package controle;

public class Programa08 {
	public static void main(String[] args) {
		String[] games = {"Mario", "Sonic", "Alex kid", null, "Zelda", "Luigi"};
		int i = 0;
		
		while(i < games.length) {
			try {
				System.out.println(games[i].toUpperCase());
			}
			catch(NullPointerException e) {
				System.out.println("Erro: " + e.getMessage());
			}
			finally {
				i++;
			}
		}
	}
}