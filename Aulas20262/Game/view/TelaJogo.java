package view;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class TelaJogo extends JFrame {
  private final int FPS = 1000 / 20; // 20
	
  class Sprite {
    public int x, y, largura, altura;
    public float velocidade;
		
    public Sprite(int x, int y, int largura, int altura) {
	this.x = x;
	this.y = y;
	this.largura = largura;
	this.altura = altura;
    }
  }	
	
  private JPanel tela;
  private boolean jogando = true;
  private boolean fimJogo = false;
	
  private Sprite tiro;
  private Sprite jogador;
  private Sprite[] blocos;
	
  private int pontos;
  private int larg = 50; // Largura padrão
  private int linhaLimite = 350;
  private Random randomico = new Random();
	
  private boolean[] controleTecla = new boolean[4];
		
  public void definirTecla(int tecla, boolean pressionada) {
    switch(tecla) {
	case KeyEvent.VK_ESCAPE:
	  fimJogo = true; break;
	case KeyEvent.VK_UP:
	  controleTecla[0] = pressionada; controleTecla[1] = false; break; 
	case KeyEvent.VK_DOWN:
	  controleTecla[1] = pressionada; controleTecla[0] = false; break;
	case KeyEvent.VK_LEFT:
	  controleTecla[2] = pressionada; controleTecla[3] = false; break;
	case KeyEvent.VK_RIGHT:
	  controleTecla[3] = pressionada; controleTecla[2] = false; break;
    }
  }

  public boolean colidir(Sprite a, Sprite b) {
    if(a.x + a.largura >= b.x && a.x <= b.x + b.largura)
	return true;
		
    return false;
  }
	
  public void atualizar() {
    if(fimJogo)
	return;
		
    if(controleTecla[2])
	jogador.x -= jogador.velocidade;
    else if(controleTecla[3])
	jogador.x += jogador.velocidade;
		
    if(jogador.x < 0)
	jogador.x = tela.getWidth() - jogador.largura;
		
    if(jogador.x + jogador.largura > tela.getWidth())
	jogador.x = 0;
		
    tiro.y = 0;
    tiro.x = jogador.x + jogador.largura / 2;
		
    for(Sprite bloco : blocos) {
	if(bloco.y > linhaLimite) {
	  fimJogo = true;
	  break;
	}
			
	if(colidir(bloco, tiro) && bloco.y > 0) {
	  bloco.y -= bloco.velocidade * 2;
	  tiro.y = bloco.y;
	}
	else {
	  int sorte = randomico.nextInt(10);
				
	  if(sorte == 0)
	    bloco.y += bloco.velocidade + 1;
	  else if(sorte == 5)
	    bloco.y -= bloco.velocidade;
	  else
	    bloco.y += bloco.velocidade;
      }
    }
		
    pontos = pontos + blocos.length;
  }
	
  public void iniciar() {
    long proxAtualizacao = 0;
		
    while(jogando) {
	if(System.currentTimeMillis() >= proxAtualizacao) {
	  atualizar();
	  tela.repaint();
	  proxAtualizacao = System.currentTimeMillis() + FPS;
	}
    }
  }
	
  public TelaJogo() {
    this.addKeyListener(new KeyListener() {
      @Override
      public void keyTyped(KeyEvent e) {
      }

      @Override
      public void keyReleased(KeyEvent e) {
	  definirTecla(e.getKeyCode(), false);
      }

      @Override
      public void keyPressed(KeyEvent e) {
	  definirTecla(e.getKeyCode(), true);
      }
    });
		
    tiro = new Sprite(0, 0, 1, 0);
    jogador = new Sprite(0, 0, larg, larg);
    jogador.velocidade = 5;
		
    blocos = new Sprite[5];
    for(int i = 0; i < blocos.length; i++) {
	int espaco = i * larg + 10 * (i + 1);
	blocos[i] = new Sprite(espaco, 0, larg, larg);
	blocos[i].velocidade = 1;
    }
		
    tela = new JPanel() {
	private static final long serialVersionUID = 1L;
			
	@Override
	public void paintComponent(Graphics g) {
	  g.setColor(Color.WHITE);
	  g.fillRect(0, 0, tela.getWidth(), tela.getHeight());
								
	  g.setColor(Color.RED);
	  g.fillRect(tiro.x, tiro.y, tiro.largura, tela.getHeight());
				
	  g.setColor(Color.GREEN);
	  g.fillRect(jogador.x, jogador.y, jogador.largura, jogador.altura);
				
	  g.setColor(Color.BLUE);
	  for(Sprite bloco : blocos) {
	    g.fillRect(bloco.x, bloco.y, bloco.largura, bloco.altura);
	  }
				
	  g.setColor(Color.GRAY);
	  g.drawLine(0, linhaLimite, tela.getWidth(), linhaLimite);
				
	  g.drawString("Pontos: " + pontos, 0, 10);
	}
    };
		
    getContentPane().add(tela);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(640, 480);
    setVisible(true);
    setResizable(false);
		
    jogador.x = tela.getWidth() / 2 - jogador.x / 2;
    jogador.y = tela.getHeight() - jogador.altura;
    tiro.altura = tela.getHeight() - jogador.altura;
  }
}
