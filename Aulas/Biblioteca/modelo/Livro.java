package modelo;

public class Livro {
	private String isbn, titulo;
	private int ano;
	
	public void inserir(String isbn, String titulo, int ano) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.ano = ano;
	}
	
	public String consultar() {
		String livro = isbn + " | " + titulo + " | " + ano;
		
		return livro;
	}
}