package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela01 extends JFrame {
	private JPanel tela;
	
	public Janela01() {
		tela = new JPanel() {
			public void paintComponent(Graphics g) {
				g.setColor(Color.BLUE);
				g.drawLine(0, 240, 640, 240);
				g.drawRect(10, 25, 30, 30);
				g.drawOval(100, 20, 140, 140);
				
				g.setColor(Color.RED);
				g.drawLine(320, 0, 320, 480);
				g.fillRect(110, 125, 130, 130);
				g.fillOval(230, 220, 240, 240);
				
				g.setColor(Color.BLACK);
				g.drawString("PONTUAÇÃO", 5, 15);
			}
		};
		
		getContentPane().add(tela);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		setVisible(true);
		tela.repaint();
	}
}