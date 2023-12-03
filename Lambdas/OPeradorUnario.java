package Lambdas;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class OPeradorUnario {
   public static void main(String[] args) {
	Scanner OperadorUnario = new Scanner(System.in);
	   UnaryOperator<Integer> maisDois = n -> n + 2;
	   UnaryOperator<Integer> vezesDois = n -> n * 2;
	   UnaryOperator<Integer> aoQuadrado = n -> n *  n ;
	  int resultado1 = maisDois
			   .andThen(vezesDois)
			   .andThen(aoQuadrado)
			   .apply(0);
	   System.out.println(resultado1);
	   int resultado2 = aoQuadrado 
			   .compose(vezesDois)
			   .compose(maisDois)
			   .apply(0);
	   System.out.println(resultado2);
	OperadorUnario.close();
}}
