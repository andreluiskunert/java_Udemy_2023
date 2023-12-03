package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Forncecdor {
 public static void main(String[] args) {
	Supplier< List<String>> umLista = 
			() -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
			System.out.println(umLista.get());
			
			
}
}
