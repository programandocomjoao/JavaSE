package view;

import javax.swing.*;

public class Login extends JFrame {
	private JPanel contentPane = new JPanel();
	private JLabel rotulo1 = new JLabel("LOGIN NO SISTEMA");
	private JLabel rotulo2 = new JLabel("USUÁRIO:");
	private JLabel rotulo3 = new JLabel("SENHA:");
	private JTextField campo1 = new JTextField();
	private JPasswordField campo2 = new JPasswordField();
	private JButton botao = new JButton("Entrar no Sistema");
	
	public Login() {
		super("Meu Sistema 1.0");
		setBounds(100, 50, 270, 200);
		getContentPane().setLayout(null);
		
		rotulo1.setBounds(80, 20, 120, 20);
		add(rotulo1);
		rotulo2.setBounds(20, 60, 100, 20);
		add(rotulo2);
		rotulo3.setBounds(20, 90, 120, 20);
		add(rotulo3);
		
		campo1.setBounds(80, 60, 150, 20);
		add(campo1);
		campo2.setBounds(80, 90, 100, 20);
		add(campo2);
		
		botao.setBounds(80, 120, 150, 20);
		add(botao);
	}
}