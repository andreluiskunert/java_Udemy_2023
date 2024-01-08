package br.com.cod3r.cm.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.cod3r.cm.execao.ExplosaoException;
import br.com.cod3r.cm.execao.SairException;
import br.com.cod3r.cm.modelo.tabuleiro;

public class TabuleiroConsole {
   private tabuleiro tabuleiro;
    private Scanner entrada = new Scanner(System.in); 
     public TabuleiroConsole(tabuleiro tabuleiro) {
	   this.tabuleiro = tabuleiro;
	    executarJogo();
	    
	   }
   private void executarJogo() {
	   try {
		   boolean continuar = true;
		    while(continuar) {
		    	cicloDoJogo();
		    	System.out.println("Quer jogar mais uma vez ?  (S/n) ");
		    	String resposta = entrada.nextLine();
		    	if( "n".equalsIgnoreCase(resposta)) {
		    		continuar = false;
		    	} else {
		    		tabuleiro.reinciar();		    	}
		    }
	   } catch(SairException e) {
		   System.out.println("bye bye my friend...");
	   } finally {
		   entrada.close();
	   }
   }
   private  void cicloDoJogo() {
	    try { 
	    	  while(!tabuleiro.objetivoAlcancado()) {
	    		  System.out.println(tabuleiro);
	    		  String digitado = capturarValorDigitado(" Informe (x, y): ");
	    		Iterator<Integer> xy = Arrays.stream(digitado.split(","))
	    		  .map(e -> Integer.parseInt(e.trim()))
	    		  .iterator();
				/*
				 * System.out.println(xy.next()); 
				 * System.out.println(xy.next());
				 */
	    		digitado = capturarValorDigitado("!- Abrir ou 2 -(Des)Marcar: ");
                 if("1".equals(digitado)) {
                	 tabuleiro.abrir(xy.next(), xy.next());
                 } else  if("2".equals(digitado)) {
                	 tabuleiro.alternarMarcacao(xy.next(), xy.next());
                 } 
	    	  }
	    	System.out.println("Você ganhou....");
	    } catch(ExplosaoException e) {
	    	System.out.println(tabuleiro);
	    	System.out.println("Você perdeu... ");
	    	
	       }
	   }
     private String capturarValorDigitado(String texto)  {
    	 System.out.print(texto);
		  String digitado = entrada.nextLine();
		  if("sair".equalsIgnoreCase(digitado)) {
			  throw new SairException();
			  
		  }
		  return digitado;
		  
     }
}
