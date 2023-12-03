package Lambdas;

import java.util.Scanner;

public class CalculoTeste {
 public static void main(String[] args) {
	 Scanner CalculoTeste = new Scanner(System.in);
	   Calculo calculo = new Somar();
	
	    calculo = new Multiplicacao(); 
	   System.out.println(calculo.executar(3, 3));
	 
	 CalculoTeste.close();
}
}
