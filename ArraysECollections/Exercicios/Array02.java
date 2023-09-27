package ArraysECollections.Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Array02 {
 public static void main(String[] args) {
	Scanner Array02 = new Scanner(System.in);
	System.out.println("Array 02 ");
	 double[] notasAlunoA = new double [4];
	 notasAlunoA[0] = 7.9;
	 notasAlunoA[1] =  8;
	 notasAlunoA[2] = 6.7;
	 notasAlunoA[3] = 9.7;
	 System.out.println(Arrays.toString(notasAlunoA));
	 double totalAlunoA = 0;
	 for(int i = 0; i < notasAlunoA.length; i++) {
		 totalAlunoA += notasAlunoA[i];
	 }
	 System.out.println(totalAlunoA / notasAlunoA.length);
	 System.out.println(notasAlunoA[0]);
System.out.println(notasAlunoA[notasAlunoA.length - 1]);
	 double [] notasAlunoB = {6.9, 8.9, 55, 10}; 
	 double totalAlunoB = 0;
	 for(int i = 0; i < notasAlunoB.length; i++) {
		 totalAlunoB += notasAlunoB[i];
	 }
	 System.out.println(totalAlunoB / notasAlunoB.length);
	 System.out.println("The End.");
	 
	Array02.close();
}
}
