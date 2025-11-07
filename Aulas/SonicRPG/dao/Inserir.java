package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Inserir {
	static final String URL = "jdbc:mysql://localhost/sonicrpg";
	
	public Inserir() {
		String sql = "INSERT INTO pergunta(enunciado, opcao1, opcao2, opcao3, resposta) VALUES('Qual animal é o Sonic?', 'Gato', 'Ouriço', 'Cachorro', 'B'), ('Quem é o principal inimigo do Sonic?', 'Robotnik', 'Koopa Tropa', 'Bowser', 'A'), ('Qual o melhor amigo do Sonic?', 'Shadow', 'Knucles', 'Tails', 'C')";
		
		try {
			Connection conexao = DriverManager.getConnection(URL, "root", "");
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.execute();
			
			System.out.println("Perguntas inseridas com sucesso!");
			conexao.close();
		}
		catch(SQLException e) {
			System.out.println("Erro de conexão");
		}
	}
}
