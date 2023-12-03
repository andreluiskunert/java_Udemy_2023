package Lambdas;

import java.util.function.Predicate;

public class Predicado {
  public static void main( String[] args) {
	Predicate<Produto> isCaro =
			//prod -> false;
		///	prod -> prod.preco >= 750; -> true 
			prod -> (prod.preco * (1 - prod.desconto)) >= 750; // -> true 

	Produto produto = new Produto("Notebok Lenovo Games", 3893.89, 0.15);
	System.out.println("Notebok Lenovo Games é Caro ? "+isCaro.test(produto));
}
}
