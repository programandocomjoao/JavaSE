package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela02 extends JFrame {
	private JPanel tela;
	private int px, py;
	private boolean jogando = true;
	private int fps = 50;
	
	public void iniciarAnimacao() {
		long proximaAtualizacao = 0;
		
		while(jogando) {
			if(System.currentTimeMillis() >= proximaAtualizacao) {
				tela.repaint();
				proximaAtualizacao = System.currentTimeMillis() + fps;
			}
		}
	}
	
	public Janela02() {
		super.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				int tecla = e.getKeyCode();
				
				switch(tecla) {
					case KeyEvent.VK_ESCAPE: jogando = false; dispose(); break;
					case KeyEvent.VK_UP: py--; break;
					case KeyEvent.VK_DOWN: py++; break;
					case KeyEvent.VK_LEFT: px--; break;
					case KeyEvent.VK_RIGHT: px++; break;
				}
			}
		});
		
		tela = new JPanel() {
			public void paintComponent(Graphics g) {
				// Limpando os desenhos anteriores
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, tela.getWidth(), tela.getHeight());
				
				int x = tela.getWidth() / 2 - 20 + px;
				int y = tela.getHeight() / 2 - 20 + py;
				
				g.setColor(Color.BLUE);
				g.fillRect(x, y, 40, 40);
			}
		};
	
		getContentPane().add(tela);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		setVisible(true);
	}
}