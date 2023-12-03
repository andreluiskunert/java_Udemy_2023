package Lambdas;

import java.util.Iterator;

public class Trabalho01  implements Runnable{

	public void run() {
	for(int i = 0; i < 100; i++) {
		System.out.println("Tarefa #01 ...");
		try {
			Thread.sleep(100) ;
		}	catch(Exception e) {
			
		}

	}
		
	}
}
