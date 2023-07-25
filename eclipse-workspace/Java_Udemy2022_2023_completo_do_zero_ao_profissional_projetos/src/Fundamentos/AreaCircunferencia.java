package Fundamentos;

import java.util.Scanner;

public class AreaCircunferencia {
 public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("..............Area da Circunferencia..........");
	//System.out.printf("Sona de 2 + 3 = " + 2 + 3 );
	double raio = 3.4;
	final double PI = 3.14159;
	System.out.println("PI * raio * raio  = " +  PI * raio * raio + ";");
	double area = PI * raio * raio;
    System.out.println("A área é "+ area + ";");
   raio = 10;
   area = PI * raio * raio;
   System.out.println("àrea = " +  area + "m2;");
	System.out.println("The End.");
	entrada.close();
}
}
