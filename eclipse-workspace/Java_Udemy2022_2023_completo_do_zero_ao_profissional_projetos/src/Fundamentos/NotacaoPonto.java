package Fundamentos;

import java.util.Scanner;

public class NotacaoPonto {
 public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	 System.out.println("--- Notação Ponto----");
	 	double  I = 2020;
	 	String  N = " Java";
	 	//s.toUpperCase(N);
	 	//s.toUpperCase(N)
	 	N = N.toUpperCase();
	 	N = N.replace("Java", "JavaSCript");
	 	N = N.concat(" JDK");
	   System.out.println("Estudo" + N + " Pela Udemy.." +  I + ";");
	   String JDK = "JAVA".toUpperCase()
	   System.out.println(JDK);
   	   String JDK1= "Estudar Java"
   			   .replace("JDK", "java")
   			   .toUpperCase()
   			   .concat(JDK) ;
   	   System.out.println(JDK1);

			   System.out.println("The End.");
	 entrada.close();
}
}
