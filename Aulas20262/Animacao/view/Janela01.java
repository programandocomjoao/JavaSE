package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela01 extends JFrame {
	private JPanel tela;
	private int fps = 50;
	private int cont;
	private boolean animacao = true;
	
	public void iniciarAnimacao() {
		long proximaAtualizacao = 0;
		
		while(animacao) {
			if(System.currentTimeMillis() >= proximaAtualizacao) {
				cont++;
				tela.repaint();
				proximaAtualizacao = System.currentTimeMillis() + fps;
				
				if(cont == 100)
					animacao = false;
			}
		}
	}
	
	public Janela01() {
		tela = new JPanel() {
			public void paintComponent(Graphics g) {
				// Limpando os desenhos anteriores
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, tela.getWidth(), tela.getHeight());
				
				g.setColor(Color.BLUE);
				g.drawLine(0, 240 + cont, 640, 240 + cont);
				g.drawRect(10, 25 + cont, 30, 30);
				g.drawOval(100 + cont, 20, 140, 140);
				
				g.setColor(Color.RED);
				g.drawLine(320 - cont, 0, 320 - cont, 480);
				g.fillRect(110, 125, 130 - cont, 130 - cont);
				g.fillOval(230, 220, 240 + cont, 240);
				
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