package ArraysECollections.Colecoes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	 public static void main(String[] args) {
		Scanner ConjutntoComportado = new Scanner(System.in);
		System.out.println("Conjutnto Comportado ");
		System.out.println("Explica passo a passo...");
	//	 Set<String> listaAprovados = new HashSet<>();
		 SortedSet<String> listaAprovados = new TreeSet<>();
		 listaAprovados.add("Lucas Camargo;");
		 listaAprovados.add("Luis Carlos;");
		 listaAprovados.add("Jean Cardoso");
		 for (String candidato: listaAprovados) {
			 System.out.println("O futuro casado será..." + listaAprovados +";" );
		 }
		 
		 Set<Integer> nums = new HashSet<>();
		 nums.add(3);
		 nums.add(5);
		 nums.add(7);
	    for(int n: nums) {
	    	System.out.print("O valor de N è " + n + ";\n");
	    	
	    }
		 
System.out.println("The End.");
		ConjutntoComportado.close();
		
	}

}
