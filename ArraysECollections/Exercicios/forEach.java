package ArraysECollections.Exercicios;

import java.util.Scanner;

public interface forEach {
	public static void main(String[] args) {
		Scanner forEAch = new Scanner(System.in);
		 System.out.println(" forEAch ");
		 System.out.println("Explica da exemplo.....");
		   double[] notas = { 9.9, 8.7,  7.2, 9.4};
		    for(int i = 0; i < notas.length; i++) {
		    	System.out.print(notas[1] + "");
		    }
		     System.out.println();
		    for(double nota : notas) {
		    	System.out.print(nota + "\n");
		    }
		 System.out.println("The End.");
		forEAch.close();
	}

}
