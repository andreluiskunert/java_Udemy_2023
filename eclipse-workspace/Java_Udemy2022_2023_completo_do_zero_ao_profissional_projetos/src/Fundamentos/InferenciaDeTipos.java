package Fundamentos;

import java.util.Scanner;

public class InferenciaDeTipos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println(" Intferencia de tipoos ");
		double a = 4.5;
		System.out.println("O valor de a é " + a);

		var b = 7.7;
		System.out.println("O valr de b é " + b);

		var c = "Texto";
		System.out.println("O valor de c é " + c);

		c = "Outro TExcto";
		System.out.println("O valor de c é " + c);

		// c = 4.5; //-> no Java não pode..
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		 * Type mismatch: cannot convert from double to String
		 * 
		 * at Java_Udemy2022_2023_completo_do_zero_ao_profissional_projetos/Fundamentos.
		 * InferenciaDeTipos.main(InferenciaDeTipos.java:21)
		 * 
		 */
		double d; // Variável foi declarada
		d = 7537531; // ////// /// inicaida...
		System.out.println("O valor de D é " + d); // Usada...
		/*
		 * var e; e = 1234567;
		 * 
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		 * Cannot use 'var' on variable without initializer at
		 * Java_Udemy2022_2023_completo_do_zero_ao_profissional_projetos/Fundamentos.
		 * InferenciaDeTipos.main(InferenciaDeTipos.java:32)
		 * 
		 */
		var e = 1234567;
		System.out.println("O valor de E é" + e);
		var  f = 12; // inteiro
		// f = 12.02;
		System.out.println("O valor de F é "+ f);

		System.out.println("The End.");
		entrada.close();
	}

}
