package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controle.ControleProduto;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDescricao;
	private JTextField textPreco;
	private ControleProduto controleProduto =  new ControleProduto();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastro() {
		setResizable(false);
		setTitle("Cadastro de Produto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CADASTRO DE PRODUTO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 11, 414, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DESCRIÇÃO:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(20, 77, 143, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PREÇO (R$):");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2.setBounds(20, 123, 143, 35);
		contentPane.add(lblNewLabel_2);
		
		textDescricao = new JTextField();
		textDescricao.setFont(new Font("Arial", Font.PLAIN, 18));
		textDescricao.setBounds(150, 77, 274, 35);
		contentPane.add(textDescricao);
		textDescricao.setColumns(10);
		
		textPreco = new JTextField();
		textPreco.setFont(new Font("Arial", Font.PLAIN, 18));
		textPreco.setBounds(150, 123, 143, 35);
		contentPane.add(textPreco);
		textPreco.setColumns(10);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String descricao = textDescricao.getText();
				float preco = Float.parseFloat(textPreco.getText());
				
				controleProduto.cadastrar(descricao, preco);
				
				JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
				
				textDescricao.setText("");
				textPreco.setText("");
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setBounds(150, 169, 143, 35);
		contentPane.add(btnNewButton);

	}
}
