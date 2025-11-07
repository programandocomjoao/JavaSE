package view;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pergunta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static final String URL = "jdbc:mysql://localhost/sonicrpg";
	private String enunciado, opcao1, opcao2, opcao3;
	private String resposta; 

	/**
	 * Create the frame.
	 */
	public Pergunta(int id) {
		setBounds(100, 100, 250, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String sql = "SELECT * FROM pergunta WHERE id = " + id;
		
		try {
			Connection conexao = DriverManager.getConnection(URL, "root", "");
			PreparedStatement operacao = conexao.prepareStatement(sql);
			ResultSet resultado = operacao.executeQuery();
			
			resultado.first();
			enunciado = (String)resultado.getObject(2);
			opcao1 = (String)resultado.getObject(3);
			opcao2 = (String)resultado.getObject(4);
			opcao3 = (String)resultado.getObject(5);
			resposta = (String)resultado.getObject(6); 
						
			conexao.close();
		}
		catch(SQLException e) {
			System.out.println("Erro de conexão");
		}
		
		JTextArea textArea = new JTextArea(enunciado);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 14));
		textArea.setBounds(10, 11, 214, 73);
		textArea.setLineWrap(true);
		contentPane.add(textArea);
		
		JRadioButton op1 = new JRadioButton(opcao1);
		op1.setBounds(6, 102, 109, 23);
		contentPane.add(op1);
		
		JRadioButton op2 = new JRadioButton(opcao2);
		op2.setBounds(6, 140, 109, 23);
		contentPane.add(op2);
		
		JRadioButton op3 = new JRadioButton(opcao3);
		op3.setBounds(6, 177, 109, 23);
		contentPane.add(op3);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(op1);
		grupo.add(op2);
		grupo.add(op3);
		
		JButton btnNewButton = new JButton("VERIFICAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(op1.isSelected() == true && resposta.compareTo("A") == 0)
					JOptionPane.showMessageDialog(null, "PARABÉNS! ACERTOU!");
				else if(op2.isSelected() == true && resposta.compareTo("B") == 0)
					JOptionPane.showMessageDialog(null, "PARABÉNS! ACERTOU!");
				else if(op3.isSelected() == true && resposta.compareTo("C") == 0)
					JOptionPane.showMessageDialog(null, "PARABÉNS! ACERTOU!");
				else
					JOptionPane.showMessageDialog(null, "PUXA VIDA! ERROU!");
				
				setVisible(false);
			}
		});
		btnNewButton.setBounds(38, 216, 166, 34);
		contentPane.add(btnNewButton);

	}
}