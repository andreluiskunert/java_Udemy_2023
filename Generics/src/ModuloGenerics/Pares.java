package ModuloGenerics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number , V> {
	// Quarta-feira 10/012024
	// 12:08:00 a 12:35:00 h+|-
	
  private final Set<Par <C,  V>> itens = new LinkedHashSet<>();
  //Fazer casa intennet é muitismo ruim....
  /// Quarta-feira,10/01/2024
  public void adicionar(C chave, V valor) {
	  if(chave == null) return;
		/*
		 * if(chave !=null) { itens.add(new Par<C, V>(chave, valor)); }
		 */
	  Par<C, V> novoPar = new Par<C, V>(chave, valor);
	  if(itens.contains(novoPar)) {
		  itens.remove(novoPar);
		  }
	
	itens.add(novoPar) ; 
  }
  // 2ª parte
   public V getValor(C chave) {
	   if(chave == null) return null;
	    Optional<Par <C, V>>parOpcional = itens.stream()
			   .filter(par-> chave.equals(par.getChave()))
			   .findFirst(); 
	    return parOpcional.isPresent()
    		 ? parOpcional.get().getValor(): null;
    }
    
 }
