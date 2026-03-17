package controle;

import modelo.Apartamento;
import modelo.Vaga;

public class Programa {
	public static void main(String[] args) {
		Apartamento apartamento = new Apartamento(7, 701);
		Vaga vaga = new Vaga('A', 13);
		
		apartamento.setVaga(vaga);
		vaga.setApartamento(apartamento);
	}
}