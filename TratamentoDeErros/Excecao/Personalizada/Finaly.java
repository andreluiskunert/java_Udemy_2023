package TratamentoDeErros.Excecao.Personalizada;

import java.util.Scanner;

public class Finaly {
	public static void main(String[] args) {
		try {
			Scanner entrada = new Scanner(System.in);
			 System.out.println(7 / entrada.nextInt());
			 entrada.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
    	} finally {
		System.out.println("Finally #01...");
		try {
			Scanner entrada = new Scanner(System.in);
			 System.out.println(7 / entrada.nextInt());
			 entrada.close();
		} finally {
		System.out.println("Finally #02..");
		//entrada.close();
		}
		System.out.println("Fim...");
	}

  }
}
