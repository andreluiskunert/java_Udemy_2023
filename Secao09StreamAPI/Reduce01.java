package Secao09StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce01 {
 public static void main(String[] args) {
	List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	BinaryOperator<Integer> soma = (ac, n) -> ac + n;
	int total1 = nums.stream().reduce(soma).get();
	System.out.println(total1); // 45 
	Integer total2 = nums.parallelStream().reduce(1, soma);
	// Resultado foi um OPcional<Integer>...
	System.out.println(total2); // 945
	nums.stream()
	 .filter(n -> n > 5)
	 .reduce(soma)
	 .ifPresent(System.out::println);
	
	
	

	
	
}
}
