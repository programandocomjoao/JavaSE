package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoInclusao2 {
	static final String url = "jdbc:mysql://localhost/mgu";
	
	public DaoInclusao2() {
		String sql = "INSERT INTO game(titulo, ano) VALUES('Paredão', 1977), " +
					 "('Contra', 1987), ('Black Belt', 1987), " +
					 "('Golden Axe', 1988), ('Mario Kart 64', 1996)";
		
		try {
			Connection conexao = DriverManager.getConnection(url, "root", "");
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.execute();
			
			System.out.print("Games inseridos com sucesso!");
			conexao.close();
		}
		catch (SQLException e) {
			System.out.print("Erro: " + e.getMessage());
		}
	}
}