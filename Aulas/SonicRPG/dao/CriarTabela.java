package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CriarTabela {
	static final String URL = "jdbc:mysql://localhost/sonicrpg";
	
	public CriarTabela() {
		String sql = "CREATE TABLE pergunta(id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, enunciado VARCHAR(100), opcao1 VARCHAR(50), opcao2 VARCHAR(50), opcao3 VARCHAR(50), resposta CHAR(1))";
	
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