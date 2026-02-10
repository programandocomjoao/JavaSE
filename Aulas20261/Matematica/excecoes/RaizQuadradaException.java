package excecoes;

//public class RaizQuadradaException extends RuntimeException {
public class RaizQuadradaException extends Exception {
	public RaizQuadradaException() {
		super("Número negativo não tem raiz quadrada!");
	}
}