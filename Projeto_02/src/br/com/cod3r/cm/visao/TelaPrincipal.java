package br.com.cod3r.cm.visao;

import javax.swing.JFrame;

import br.com.cod3r.cm.modelo.tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{
	public TelaPrincipal() {
		tabuleiro tabuleiro = new tabuleiro(16, 30, 50);
		add(new PainelTabuleiro(tabuleiro));
		
	  setTitle("Campo Minado");
	  setSize(690, 438);
	  setLocationRelativeTo(null);
	  setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	  setVisible(true);
	}
    public static void main(String[] args) {
		new TelaPrincipal();
		
	}
}
