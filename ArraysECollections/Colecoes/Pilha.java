package ArraysECollections.Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		System.out.println("Pilha");
		livros.add("Iracema - José de Alencar;");
		livros.push("A moreninha - Graciliano Ranmos");
		livros.push("Memórias postomas de Bras Cuba");
		System.out.println(livros.peek());
		System.out.println(livros.peek()) ;
		System.out.println(livros.element());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println("The End.");
		
		}

}
