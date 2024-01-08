package br.com.cod3r.cm;

import br.com.cod3r.cm.modelo.tabuleiro;
import br.com.cod3r.cm.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		/*
		 * tabuleiro tabuleiro = new tabuleiro(6, 6, 6); //
		 * System.out.println("Tende a sorte..." + tabuleiro); Tende a
		 * sorte...br.com.cod3r.cm.modelo.tabuleiro@7cef4e59 tabuleiro.abrir(3, 3);
		 * tabuleiro.alternarMarcacao(4 , 4); tabuleiro.alternarMarcacao(4, 6);
		 * tabuleiro.abrir(3, 3);
		 * 
		 * System.out.println(tabuleiro); } new tabuleiroConsole(tabuleiro);
		 */
		tabuleiro tabuleiro = new tabuleiro(6, 6, 6);
			new TabuleiroConsole(tabuleiro);
			

	}
}
