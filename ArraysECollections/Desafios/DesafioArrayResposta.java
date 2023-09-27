package ArraysECollections.Desafios;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrayResposta {
 public static void main(String[] args) {
	Scanner DesafioArrayResposta = new Scanner(System.in);
	 System.out.println("Desafio Array Resposta");
	 System.out.println("Quantas nptas: ");
	 int qtdeNotas = DesafioArrayResposta.nextInt();
	 double [] notas = new double[qtdeNotas];
	  for(int i = 0; i < notas.length; i++) {
		  System.out.print("Informe a nota "+ ( i + 1 ) + ":" );
		  notas[i] =  DesafioArrayResposta.nextInt();
	  }
	  double total = 0;
	  for(double nota: notas) {
		  total += nota;
	  }
	  double media = total / notas.length;
	  System.out.println("A média é "  + media + ";" );
	  System.out.println(Arrays.toString(notas));
	  
			 System.out.println("The End.");
	DesafioArrayResposta.close();
}
}
