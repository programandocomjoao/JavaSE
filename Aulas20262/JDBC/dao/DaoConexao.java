package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoConexao {
	static final String url = "jdbc:mysql://localhost";
	static final String usuario = "root";
	static final String senha = "";
	
	public DaoConexao() {
		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão estabelecida com sucesso!");
			conexao.close();
		}
		catch(SQLException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}