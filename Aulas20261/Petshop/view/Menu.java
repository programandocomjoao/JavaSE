package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("PetSys 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PETSHOP PELOS E PATAS");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 53);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("CADASTRAR ANIMAL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroAnimal cadastro = new CadastroAnimal();
				cadastro.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(20, 75, 192, 175);
		contentPane.add(btnNewButton);
		
		JButton btnConsultarAnimal = new JButton("CONSULTAR ANIMAL");
		btnConsultarAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaAnimal consulta = new ConsultaAnimal();
				consulta.setVisible(true);
			}
		});
		btnConsultarAnimal.setFont(new Font("Arial", Font.BOLD, 14));
		btnConsultarAnimal.setBounds(222, 75, 192, 175);
		contentPane.add(btnConsultarAnimal);

	}
}
