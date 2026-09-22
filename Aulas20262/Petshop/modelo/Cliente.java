package modelo;

public class Cliente {
	private String cpf, nome;
	private Animal[] animais;
	private int i = 0;

	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
		animais = new Animal[3];
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public Animal[] getAnimais() {
		return animais;
	}

	public void adAnimal(Animal animal) {
		if(i < animais.length) {
			animais[i] = animal;
			i++;
			animal.setCliente(this);
		}
	}
		
	public void removeAnimal(Animal animal) {
		
	}
}