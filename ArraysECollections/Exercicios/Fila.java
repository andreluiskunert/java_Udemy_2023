package ArraysECollections.Exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {
 public static void main(String[] args) {
	Scanner Fila = new Scanner (System.in);
	System.out.println("Fila..");
	Queue<String> fila = new LinkedList<>();
	// Offer e Ad  -> Adicionam elementos na fila
	// Diferença é o comoportamento quanto a fila está cheia... 
	fila.add("Ana");// retorna false
	fila.offer("Bia"); // lança uma exceção 
	fila.add("Carlos");
	fila.offer("Daniel");
	fila.add("Rafael");
	fila.offer("Gui");
	System.out.println(fila.peek());
	System.out.println(fila.peek());
	System.out.println(fila.element());
	System.out.println(fila.element());
	// Peek e Element -> é compprtamento ocorre 
	// da fila (sem remover)
   System.out.println(fila.poll());
   System.out.println(fila.remove());
   System.out.println(fila.poll());
   System.out.println(fila.poll());
   System.out.println(fila.poll());
   System.out.println(fila.poll()); 
  /*
   * fila.size
   * fila.clear();
   * fila.isEmpty();
   *    */
	
	
	System.out.println("The End.");
;
	Fila.close();
}
}
