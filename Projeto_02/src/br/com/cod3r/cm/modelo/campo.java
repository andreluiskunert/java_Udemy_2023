package br.com.cod3r.cm.modelo;
import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.cm.visao.BotaoCampo;

public class campo {
  private  final int linha;
  private  final int coluna;
  // ações do Jogo
  private boolean aberto = false;
  private boolean minado = false ;
  private boolean marcado = false;
  private List<campo> vizinhos = new ArrayList<>();
  /*
   * Adicionar vizinho primeiro video explicou  como funciona;
   * dando exemplos... 
   * Adicionar vizinho segundo video explicou colocou em pratica...
   * Object eventoOcrreu(campo campo, CampoEvento evento) {

	}
   */
  private List<CampoObservador> observadores = new ArrayList<>();  
  // Depos contunuo....
  campo(int linha, int coluna) {
	  this.linha = linha;
	  this.coluna = coluna;
	  
  }
  public void registrarObservador1(tabuleiro tabuleiro) {
	 observadores.add(tabuleiro);
  }
  private void notificarObservadores(CampoEvento evento) {
	  observadores.stream()
	  .forEach(observador -> observador.eventoOcorreu(this, evento));
  }
  /// após o almoço.....
    boolean  adicionarVizinho(campo vizinho) {
	  boolean linhaDiferente = linha != vizinho.linha;
	  boolean colunaDiferente = coluna != vizinho.coluna;
	  boolean diagonal = linhaDiferente && colunaDiferente;
	  
	  int deltaLinha = Math.abs(linha - vizinho.linha);
	  int deltaColuna = Math.abs(coluna - vizinho.coluna);
	  int deltaGeral = deltaColuna + deltaLinha;
	  // Farei à noite...
	  if(deltaGeral == 1 && !diagonal) {
		  vizinhos.add(vizinho);
		} else if (deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else {
			return false;
			
		}
	      return diagonal;
	  
	  
	  
  }
    // Classe Campo: Abrir #01 
    // Terça-feira, 02/01/2024 de Manhã "Aproveitando o tempo..."
   public void alternarMarcacao() {
    	if(!aberto) {
    		marcado = !marcado;
    		if(marcado) {
    			notificarObservadores(CampoEvento.MARCAR);
    		} else {
    			notificarObservadores(CampoEvento.DESMARCAR);
    		}
    		
    	}
    }
   public boolean abrir() {
    	if(!aberto && !marcado) {
			/* aberto = true; */
    		if(minado) {
    			// TODO implementar nova versaõ 
        		// FIXME há um erro que recisa ser corregido;
    			notificarObservadores(CampoEvento.EXPLODIR);
    			return true;
        	}
    		setAberto(true);
    		
    		if(vizinhancaSegura()) {
    			vizinhos.forEach(v -> v.abrir());
    			
    		}
    		return true;
    	} else {
    		return false;
    	}
    	
   }
   public  boolean vizinhancaSegura() {
      return vizinhos.stream().noneMatch(v -> v.minado)	;
    }
    // Terça-feira 02/01/2024  à noite
    // Das 19:42:00 a h+|-
    void minar() {
    	if(!minado) {
    		minado = true;
    		
    	}
    }
    public boolean isMinado() {
    	return minado;
    	
    }
    public boolean isMarcado() {
    	return marcado;
    	
    }
    public boolean isAberto() {
    	return aberto;
    
    }
    
    void setAberto(boolean aberto) {
		this.aberto = aberto;
		if(aberto) {
			 notificarObservadores(CampoEvento.ABRIR);
		}
	}
	public boolean isFechadoo() {
    	return !isAberto();
    
    }
    //  Quarta-feira,03/01/2024 
    // das 12:15:00 a  12:37:29  h+|-
    // Obs.; Aproveitar o horário de almoço..
	public int getLinha() {
		return linha;
	}
	public int getColuna() {
		return coluna;
	}
    boolean objetivoAlcancado() {
    	boolean desvendado = !minado && aberto;
    	boolean protegido = minado && marcado;
    	return desvendado || protegido;
    	
    }
    public int minasNaVizinhanca() {
    	return (int) vizinhos.stream().filter(v -> v.minado).count();
    }
    void reiniciar() {
    	aberto = false;
    	minado = false;
    	marcado = false;
    	notificarObservadores(CampoEvento.REINICIAR);
    	
    }
	public void registrarObservador(BotaoCampo botaoCampo) {
		// TODO Auto-generated method stub
		
	}
	public void registrarObservador(tabuleiro tabuleiro) {
		// TODO Auto-generated method stub
		
	}
  
    }

