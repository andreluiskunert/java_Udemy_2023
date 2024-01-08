//package ConteudoExplicado;

//public class texto {
	/*
	 * package br.com.cod3r.cm.visao;

import java.util.Arrays;
import java.util.Scanner;

import br.com.cod3r.cm.execao.ExplosaoException;
import br.com.cod3r.cm.execao.SairException;
import br.com.cod3r.cm.modelo.tabuleiro;

public class tabuleiroConsole {
// Sexta-feira, 05/01/2024
// Das 12:10:00 a 12:35:00  h+|-
	private tabuleiro tabuleiro;
	private Scanner entrada =  new Scanner(System.in);
	public tabuleiroConsole(tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		executarJogo();
	}
    //@SuppressWarnings("unused")
	private void executarJogo() {
		try {
			 boolean continuar = true;
			 while(continuar) {
				 System.out.println("Outra partida? [S/N]");
				 String resposta = entrada.nextLine()
;				if("N".equalsIgnoreCase(resposta)) {
					continuar = false;
                } else {
                	tabuleiro.reinciar();
                }
				
			 }
			
		} catch(SairException e ) {
			System.out.println("Tchau!!!!!!!!");
			
		} finally {
			entrada.close();
		}
	}
	  @SuppressWarnings("unused")
	private void cicloDoJogo() {
		try {
			 while(!tabuleiro.objetivoAlcancado() ) {
				 System.out.println(tabuleiro);
				 String digitado = capturarValorDigitado("Digite (x, y): " );
				 System.out.println(Arrays.toString(digitado.split(",")));
			 }
			System.out.println("Você ganho");
		} catch( ExplosaoException  e ) {
			System.out.println("Você perdeu!!!");
		}
	}
	  private String capturarValorDigitado( String texto) {
		  /*
		   * Sabado,06/01/2024
		   * das 07:56:00 a 08:16:00  h+|-
		   * 
		   */
	//	  System.out.print(texto);
	//	  String didgitado = entrada.nextLine();
	/*	  if("sair'".equalsIgnoreCase(didgitado));
		   	throw new SairException();
	  }
	   return digitado;
}*/
/*
 * Obs.: 
 * -> terei que rever a aula novamente fzendo tudo nemhuma só aula...
 * Está tendo error n "Return" não pode...
 */

/*	 */

