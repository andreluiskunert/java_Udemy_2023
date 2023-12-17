package Secao09StreamAPI.Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MapDesafio {
  public static void main(String[] args) {
	  // Terça-feira 12/12/2023 
	  // Das 12:15:00  a 12:35:00 h+|-
	 
	List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	/*
	 * 1.Número  para string binária... 6 => 110
	 * 2. Inverter a string....110 => 6
	 * 3. Converter de volta para inteiro => 011 => 3
	  */
	// A resposta é 
	// 1º:
	 nums.stream() 
	   .map(Integer::toBinaryString)
		 .forEach(System.out::println); 
	 
  //  UnaryOperator<String> inverter =
    	//	s -> new StringBuilder(s).reverse().toString();
   //  Function<String, Integer> binarioParaInt =
  //  		 s -> Integer.parseInt(s, 2);   
    		
}  
}
