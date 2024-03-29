package br.com.cod3r.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.cod3r.cm.modelo.tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {
  public PainelTabuleiro(tabuleiro tabuleiro ) {
   setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
   tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
   tabuleiro.registrarObsevador(e ->{
	   SwingUtilities.invokeLater(()->{
		   if(e.isGanhou()) {
		   JOptionPane.showMessageDialog(this,"Ganhou...guri..." );
	   } else {
		   JOptionPane.showMessageDialog(this,"Perdeu...guri..." );

	   }
		   tabuleiro.reinciar();
	   });
	   
   });
 
	}
}
