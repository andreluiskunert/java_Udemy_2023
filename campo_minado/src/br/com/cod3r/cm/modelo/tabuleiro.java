package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.cod3r.cm.execao.ExplosaoException;

public class tabuleiro {
  private int linhas;
  private int colunas;
  private int minas;
  
  private final List<campo> campos = new ArrayList<>();

public tabuleiro(int linhas, int colunas, int minas) {
	this.linhas = linhas;
	this.colunas = colunas;
	this.minas = minas;
	gerarcampos();
	associarOsVizinhos();
	sortearMinas();
	}
 public void abrir(int linha, int coluna) {
	  try {
		  campos.parallelStream() 
		  .filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
		  .findFirst()
		  .ifPresent(c -> c.abrir());
		 } catch(ExplosaoException e) {
			campos.forEach(c -> c.setAberto(true));
		  throw e;
	  }
 }
 public void  alternarMarcacao (int linha, int coluna) {
	  campos.parallelStream() 
	  .filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
	  .findFirst()
	  .ifPresent(c -> c.alternarMarcacao());
	  
	  

}
	private void gerarcampos() {
		for(int linha = 0; linha < linhas; linha++) {
			for(int coluna = 0; coluna < colunas; coluna++) {
				campos.add(new campo(linha, coluna));
			}
		}
	}
     private void associarOsVizinhos() {
	   for(campo c1: campos) {
		   for(campo c2: campos) {
			   c1.adicionarVizinho(c2);
			   
		   }
	   }
	
}
  private void sortearMinas() {
	  // Quinta-feira,04/01/2024
	  // Das 12:15:00 a 12:35:00 h+|-
	  long minasArmadas = 0;
	  Predicate<campo> minado = c -> c.isMinado();
	  do {
		 
		  /// Quinta-feira,04/01/2024
		  // 19:50:00 a 20:18:00 h+|-
		  int aleatorio =(int) (Math.random() * campos.size());
		  campos.get(aleatorio).minar(); 
		  minasArmadas = campos.stream().filter(minado).count();
		  // parei aqui faço em Casa o resto..
	  } while(minasArmadas < minas);
	}
   public  boolean objetivoAlcancado() {
	   return campos.stream().allMatch(c -> c.objetivoAlcancado());
   }
   public void reinciar() {
	   campos.stream().forEach(c -> c.reiniciar());
	   sortearMinas();
	   
   }
   public String toString() {
	   StringBuilder  sb = new StringBuilder();
	   // Apos o intervalo das 21:17:00 a 22:12:00 h +|-
	   // Pausa para a mente...
	   for (int c = 0; c < colunas; c++) {
		sb.append("  ");
		sb.append(c );
		sb.append("");
	}
	   sb.append("\n");
       int i = 0;
	   for( int l = 0; l < linhas; l++ ) { 
		   sb.append(l);
		    sb.append("");
		 for (int c = 0; c < colunas; c++) {
			   sb.append("");
			   sb.append(campos.get(i));
			   sb.append("");
			   i++;
			 
		}
		   sb.append("\n");
	   }
	   return sb.toString(); 
  }

}
