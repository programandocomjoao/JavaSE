package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoInclusao2 {
	static final String url = "jdbc:mysql://localhost/petshop";
	static final String usuario = "root";
	static final String senha = "";
	
	public DaoInclusao2() {
		String sql = "INSERT INTO animal(nome, raca) VALUES" +
	               "('Suzuki', 'Street Dog')," +
	               "('Pachola', 'Street Dog')," +
	               "('Pérola', 'Poodle')";
		
		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.execute();
			
			System.out.println("Animais incluídos com sucesso!");
			conexao.close();
		}
		catch(SQLException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}