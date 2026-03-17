package controle;

import dao.DaoAnimal;
import modelo.Animal;

public class ControleAnimal {
	private Animal animal = new Animal();
	private DaoAnimal daoAnimal = new DaoAnimal();
	
	public void cadastrarAnimal(String nome, String especie, String raca) {
		animal.setNome(nome);
		animal.setEspecie(especie);
		animal.setRaca(raca);
		daoAnimal.inserir(animal);
	}
	
	public Animal consultarAnimal(int id) {
		animal = daoAnimal.consultar(id);
		
		return animal;
	}
	
	public void alterarAnimal(int id, String nome, String especie, String raca) {
		animal.setNome(nome);
		animal.setEspecie(especie);
		animal.setRaca(raca);
		daoAnimal.alterar(id, animal);
	}
	
	public void excluirAnimal(int id) {
		daoAnimal.excluir(id);
	}
}