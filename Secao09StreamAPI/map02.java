package Secao09StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class map02 {
 public static void main(String[] args) {
	 Consumer<String> print = System.out::print;
     List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
     marcas.stream().map(m-> m.toUpperCase()).forEach(print);;
     UnaryOperator<String> maiuscula = n -> n.toUpperCase();
     UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "" ;
   ///  UnaryOperator<String> grito = n -> n + "!!!!!!!!!" ;
     System.out.println(maiuscula.andThen(primeiraLetra).andThen( Utiliarios::grito).apply("BMW"));
     System.out.println("\nUsando Composição...1º cemário...");
     marcas.stream()
      .map(maiuscula)
      .map(primeiraLetra)
      .map(Utiliarios::grito) 
      .forEach(print);
     // à noite finalizo...
     
 } 
}
