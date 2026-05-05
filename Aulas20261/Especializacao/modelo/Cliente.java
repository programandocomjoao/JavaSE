package modelo;

abstract public class Cliente /* extends Object */ {
	private String endereco, whatsapp;

	public Cliente(String endereco, String whatsapp) {
		//super();
		this.endereco = endereco;
		this.whatsapp = whatsapp;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	
	abstract public String formatarId();
}