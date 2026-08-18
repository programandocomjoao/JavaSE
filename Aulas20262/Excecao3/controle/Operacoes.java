package controle;

import excecoes.RaizQuadradaException;

public class Operacoes {
	public static float calcularRaiz(float num) throws RaizQuadradaException {
		if(num < 0)
			throw new RaizQuadradaException();
		else	
			return (float)Math.sqrt(num);
	}
}