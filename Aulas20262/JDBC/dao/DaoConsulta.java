package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoConsulta {
	static final String url = "jdbc:mysql://localhost/petshop";
	static final String usuario = "root";
	static final String senha = "";
	
	public DaoConsulta() {
		String sql = "SELECT * FROM animal WHERE id = 3";
		
		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement operacao = conexao.prepareStatement(sql);
			ResultSet resultado = operacao.executeQuery();
			
			if(resultado.next())	
				System.out.println(resultado.getObject(1) + " | " + resultado.getObject(2) + " | " + resultado.getObject(3));
			else
				System.out.println("Animal não encontrado!");
			
			conexao.close();
		}
		catch(SQLException e) {
			System.out.println("Erro: " + e.getMessage());
		}	
	}
}
