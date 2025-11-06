package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CriarTabela {
	static final String URL = "jdbc:mysql://localhost/petshop";
	
	public CriarTabela() {
		String sql = "CREATE TABLE animal(id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(30), raca VARCHAR(20))";
	
		try {
			Connection conexao = DriverManager.getConnection(URL, "root", "");
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.execute();
			
			System.out.println("Tabela criada com sucesso!");
			conexao.close();
		}
		catch(SQLException e) {
			System.out.println("Erro de conexão");
		}
	}
}