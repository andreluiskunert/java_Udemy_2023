package Fundamentos;

import java.util.Scanner;

public class Temperatura {
 public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	 System.out.println("---- Temperatura----");
	 // (ºF - 32) * 5/9 = ºC 
	 System.out.println("Bora a resposta do desaffio");
	 // 05/07/2023 - Quarfa-feira
	 final double FATOR = 5.0 / 9.0;
	 final double AJUSTE = 32;
	 double fahrenheit = 86;
	 double celsuis = (fahrenheit - AJUSTE) * FATOR;
	 
	 fahrenheit = 150;
	 System.out.println("O resultado em Celsuis é "+ celsuis + "ºC;");
	 celsuis = ( fahrenheit  - AJUSTE) * FATOR;
	 System.out.println("O resultado em Celsuis é "+  fahrenheit  + "ºC;");
	 
	 System.out.println("The End.");
	 entrada.close();
	
}
}
