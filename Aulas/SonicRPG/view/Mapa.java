package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mapa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int personagem = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mapa frame = new Mapa();
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
	public Mapa() {
		setTitle("Sonic RPG 1.0");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem = 1;
			}
		});
		btnNewButton.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.png")));
		btnNewButton.setBounds(603, 343, 40, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem = 2;
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Robotnik.png")));
		btnNewButton_1.setBounds(654, 343, 40, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem = 0;
			}
		});
		btnNewButton_2.setBounds(704, 343, 40, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem == 1)
					btnNewButton_2_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.png")));
				else if(personagem == 2)
					btnNewButton_2_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Robotnik.png")));
				else if(personagem == 0)
					btnNewButton_2_1.setIcon(new ImageIcon(Mapa.class.getResource("")));
			
				Pergunta pergunta = new Pergunta(1);
				pergunta.setVisible(true);
			}
		});
		btnNewButton_2_1.setBounds(77, 177, 40, 40);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem == 1)
					btnNewButton_2_2.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.png")));
				else if(personagem == 2)
					btnNewButton_2_2.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Robotnik.png")));
				else if(personagem == 0)
					btnNewButton_2_2.setIcon(new ImageIcon(Mapa.class.getResource("")));
			
				Pergunta pergunta = new Pergunta(2);
				pergunta.setVisible(true);
			}
		});
		btnNewButton_2_2.setBounds(127, 177, 40, 40);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem == 1)
					btnNewButton_2_3.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Sonic.png")));
				else if(personagem == 2)
					btnNewButton_2_3.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Robotnik.png")));
				else if(personagem == 0)
					btnNewButton_2_3.setIcon(new ImageIcon(Mapa.class.getResource("")));
			
				Pergunta pergunta = new Pergunta(3);
				pergunta.setVisible(true);
			}
		});
		btnNewButton_2_3.setBounds(178, 177, 40, 40);
		contentPane.add(btnNewButton_2_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/MapaSonic.jpg")));
		lblNewLabel.setBounds(0, 0, 754, 394);
		contentPane.add(lblNewLabel);
	}
}
