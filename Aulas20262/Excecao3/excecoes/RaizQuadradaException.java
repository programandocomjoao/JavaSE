package excecoes;

public class RaizQuadradaException extends Exception {
	private static String msgErro = "Raiz quadrada de número negativo";
	
	public RaizQuadradaException() {
		super(msgErro);
	}
}