package ArraysECollections.Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
 public static void main(String[] args) {
	Scanner Matriz = new Scanner(System.in);
	System.out.println("-----Matriz----");
	System.out.println("Quantos alunos? ");
	int qtdeAlunos = Matriz.nextInt();
	System.out.println("Quantas notas por  alunos? ");
	int qtdeNotas= Matriz.nextInt();
	 double[] [] notasDaTurma = new  double[qtdeAlunos] [qtdeNotas];
	 double total = 0;
	  for(int a = 0; a <  notasDaTurma.length; a++) {
		   for(int n = 0; n <  notasDaTurma[a].length; n++) {
			   System.out.printf("Informe a nota %d do aluno %d:" , n + 1 , a + 1,"/n;");
			   notasDaTurma[a] [n] = Matriz.nextDouble();
			    total += notasDaTurma[a] [n];
		   }
	   }
	  double media = total / (qtdeAlunos * qtdeNotas);
	  System.out.println("A média da turma é " + media + ";");
	  for(double[] notasDoAluno:notasDaTurma) {
		    System.out.println(Arrays.toString(notasDoAluno));
	  }
	

	 
	System.out.println("The End.");
	Matriz.close();
}
}
