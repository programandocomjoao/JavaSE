package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Produto;

public class DaoProduto {
	private String url = "jdbc:mysql://localhost/mercado";
	private String usuario = "root";
	private String senha = "";
	
	public void incluir(Produto produto) {
		String sql = "INSERT INTO produto(descricao, preco) VALUES('" 
				+ produto.getDescricao() + "', "
				+ produto.getPreco() + ")";
		
		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.execute();
		}
		catch(SQLException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public void consultar() {
		
	}
	
	public void alterar() {
		
	}
	
	public void excluir() {
		
	}
}