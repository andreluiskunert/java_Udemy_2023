package Lambdas;

import java.util.Arrays;
import java.util.List;


public class Foreach { 
	public static void main(String[] args) {
		// ForeacH #01
	
		  List<String> aprovados = Arrays.asList("Andre", "Lucas", "Luis");
		  System.out.println("Foreach#01");
		  System.out.println("Forma Tradicional..");
		   for(String nome: aprovados) {
			   System.out.println("Parabéns aos ingredientes da Republica Cristã,  " + nome +  ";");
		   }
		    System.out.println("\nLambada #01...");
		    aprovados.forEach(( nome) -> { System.out.println(nome + "...Esse serãp os Ultimos da Republica Crista "); });
		    System.out.println("\nMethod Reference...");
		    aprovados.forEach(System.out::println);
		    System.out.println("\nLambada #02");
		    aprovados.forEach(nome -> meuImprimir(nome));
	}
		    static void meuImprimir(String nome) {
			   System.out.println("Oi! Meu nome é "+ nome);  
	}
}	    
			   
		   
		

		 


