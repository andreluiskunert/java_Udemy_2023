package br.com.cod3r.cm.visao;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import br.com.cod3r.cm.modelo.CampoEvento;
import br.com.cod3r.cm.modelo.CampoObservador;
import br.com.cod3r.cm.modelo.campo;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton implements CampoObservador, MouseListener

{
	final Color BG_PADRAO = new Color(184, 184, 184);
	final Color BG_MARCAR = new Color(8, 179, 247);
	final Color BG_EXPLODIR= new Color(189, 66, 68);
	final Color TEXTO_VERDE = new Color(0, 100, 0);
	
	private campo campo;
	public BotaoCampo( campo campo) {
		this.campo = campo;
		setBackground(BG_PADRAO);
		setOpaque(true);
		setBorder(BorderFactory.createBevelBorder(0));
		// 
		addMouseListener(this);
	    campo.registrarObservador(this);
		
		
	}
  
public void eventoOcorreu(campo campo, CampoEvento evento) {
	switch(evento) {
	case ABRIR:
		 aplicarEstiloAbrir();
		 break;
	case MARCAR:
		 aplicarEstiloMarcar();
		 break;
	case EXPLODIR:
		 aplicarEstiloExplodir();
		 break;
		default:
			aplicarEstiloPadrao();
		}
		 
		 
	}

private void aplicarEstiloPadrao() {
	// Sábado,24/02/2024
	// Das 08:25:00 a 08:55:00 h +|-
	setBackground(BG_PADRAO);
	setBorder(BorderFactory.createBevelBorder(0));

	setText("");

	
}

private void aplicarEstiloExplodir() { 
	// Sábado,24/02/2024
		// Das 08:25:00 a 08:55:00 h +|-
		setBackground(BG_EXPLODIR);
		setForeground(Color.WHITE);
		setText("X");
		
}

private void aplicarEstiloMarcar() {
	// Sábado,24/02/2024
		// Das 08:25:00 a 08:55:00 h +|-
		setBackground(BG_MARCAR);
		setForeground(Color.BLACK);
		setText("M");
	
}

private void aplicarEstiloAbrir() { 
	setBorder(BorderFactory.createLineBorder(Color.GRAY));	
	if(campo.isMarcado()) {
		setBackground(BG_EXPLODIR);
		return;
	}
  setBackground(BG_PADRAO);
 
  switch (campo.minasNaVizinhanca()) {
case 1: 
	  setForeground(TEXTO_VERDE);
	   break;
   case 2:
	   setForeground(Color.BLUE);
	   break;
   case 3:
		setForeground(Color.YELLOW);
		break;
   case 4, 5, 6 :
		setForeground(Color.RED);
		break;
  default:
	  setForeground(Color.PINK);
	   
	
}
   String valor = !campo.vizinhancaSegura() ? campo.minasNaVizinhanca() + "" : "";
   setText(valor);
		   }
// Interface dos eventos do Mouse
@Override
public void mousePressed(MouseEvent e) {
	if(e.getButton() == 1 ) {
	//	System.out.println("Botão Esqurdo!! ");
		campo.abrir();
	} else {
		//System.out.println("Outro Botão!! ");
		campo.alternarMarcacao();
	}
}
public void mouseClicked(MouseEvent e) {

	
}
public void mouseEntered(MouseEvent e) {
}
public void mouseExited(MouseEvent e) { 
	}
public void mouseReleased(MouseEvent e) {
	
	
}
}
