package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoInclusao1 {
	static final String url = "jdbc:mysql://localhost/petshop";
	static final String usuario = "root";
	static final String senha = "";
	
	public DaoInclusao1() {
		String sql = "INSERT INTO animal(nome, raca) VALUES('Mel', 'Poodle')";
		
		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.execute();
			
			System.out.println("Animal incluído com sucesso!");
			conexao.close();
		}
		catch(SQLException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}