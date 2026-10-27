package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoCriacaoBD {
	static final String url = "jdbc:mysql://localhost";
	static final String usuario = "root";
	static final String senha = "";
	
	public DaoCriacaoBD() {
		String sql = "CREATE DATABASE petshop";
		
		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.execute();
			
			System.out.println("Banco de dados criado com sucesso!");
			conexao.close();
		}
		catch(SQLException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}