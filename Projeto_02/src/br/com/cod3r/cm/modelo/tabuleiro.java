package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class tabuleiro implements CampoObservador {
  private final int linhas;
  private final int colunas;
  private final int minas;
  
  private final List<campo> campos = new ArrayList<>();
  private final List<Consumer<ResultadoEvento>> observadores = new ArrayList<>();

public tabuleiro(int linhas, int colunas, int minas) {
	this.linhas = linhas;
	this.colunas = colunas;
	this.minas = minas;
	gerarcampos();
	associarOsVizinhos();
	sortearMinas();
	}
 public void paraCadaCampo(Consumer<campo> funcao ) {
	campos.forEach(funcao);

}
public void registrarObsevador(Consumer<ResultadoEvento> observador) {
	observadores.add(observador);
}
private void notificarObservadores(Boolean resultado) {
	  observadores.stream()
	  .forEach(observador -> observador.accept(new ResultadoEvento(resultado)));
}
 public void abrir(int linha, int coluna) {
		  campos.parallelStream() 
		  .filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
		  .findFirst()
		  .ifPresent(c -> c.abrir());
		 

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
			//	campos.add(new campo(linha, coluna));
				campo campo = new campo(linha, coluna);
				campo.registrarObservador(this);
				campos.add(campo);
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
   
   public int getLinhas() {
	return linhas;
}
public int getColunas() {
	return colunas;
}
public void eventoOcorreu(campo campo, CampoEvento evento) {
	   if(evento == CampoEvento.EXPLODIR) {
		   System.out.println("Perdeu mane....faz o L....kkkkk");
		   notificarObservadores(false);
	   } else if(objetivoAlcancado()) {
		  System.out.println("Ganhou mais imposto....kkkkk");
		  notificarObservadores(true);
		  
	   }
	   
   }
   public void mostrarMinas() {
		  campos.stream()
		  .filter(c -> c.isMinado())
		  .filter(c -> !c.isMinado())
		  .forEach(c -> c.setAberto(true));
	  }
}
