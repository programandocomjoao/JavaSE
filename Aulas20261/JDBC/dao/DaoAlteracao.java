package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoAlteracao {
	static final String url = "jdbc:mysql://localhost/mgu";
	
	public DaoAlteracao() {
		String sql = "UPDATE game SET ano = 1992 WHERE id = 6";
		//String sql = "UPDATE game SET id = id - 1 WHERE id > 6";
		
		try {
			Connection conexao = DriverManager.getConnection(url, "root", "");
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.execute();
			
			System.out.print("Game alterado com sucesso!");
			conexao.close();
		}
		catch (SQLException e) {
			System.out.print("Erro: " + e.getMessage());
		}
	}
}