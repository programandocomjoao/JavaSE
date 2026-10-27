package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoCriacaoTabela {
	static final String url = "jdbc:mysql://localhost/petshop";
	static final String usuario = "root";
	static final String senha = "";
	
	public DaoCriacaoTabela() {
		String sql = "CREATE TABLE animal(id INT NOT NULL AUTO_INCREMENT " 
	             + "PRIMARY KEY, nome VARCHAR(30), raca VARCHAR(20))";
		
		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.execute();
			
			System.out.println("Tabela criada com sucesso!");
			conexao.close();
		}
		catch(SQLException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}