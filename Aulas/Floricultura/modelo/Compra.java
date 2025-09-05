package modelo;

import java.util.Calendar;

public class Compra {
	private String data;
	private float valor;
	
	public Compra() {
		Calendar c = Calendar.getInstance();
		
		int dia = c.get(Calendar.DAY_OF_MONTH);
		int mes = c.get(Calendar.MONTH) + 1;
		int ano = c.get(Calendar.YEAR);
		
		data = dia + "/" + mes + "/" + ano;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
}