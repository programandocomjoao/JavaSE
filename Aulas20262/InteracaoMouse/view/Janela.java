package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame {
	private JPanel tela;
	private int px, py;
	private boolean jogando = true;
	private int fps = 50;
	private Point mouse = new Point();
	
	public void atualizar() {
		px = mouse.x;
		py = mouse.y;
	}
	
	public void iniciar() {
		long proximaAtualizacao = 0;
		
		while(jogando) {
			if(System.currentTimeMillis() >= proximaAtualizacao) {
				atualizar();
				tela.repaint();
				proximaAtualizacao = System.currentTimeMillis() + fps;
			}
		}
	}
	
	public Janela() {
		tela = new JPanel() {
			public void paintComponent(Graphics g) {
				// Limpando os desenhos anteriores
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, tela.getWidth(), tela.getHeight());
					
				g.setColor(Color.BLUE);
				g.fillRect(px, py, 40, 40);
			}
		};
		
		tela.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {		
			}
			
			@Override
			public void mousePressed(MouseEvent e) {			
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				mouse = e.getPoint();				
			}
		});
		
		getContentPane().add(tela);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		setVisible(true);
	}
}