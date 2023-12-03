package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		// NÃO : Int -> Double;
		// double -> Double;
		// Ex:
		    Double a = 1.0;
	       System.out.println(a);
		    BinaryOperator<Double> calc = (x, y ) -> {  return x + y; };
		   System.out.println(calc.apply(3.0, 3.0));
		   calc = (x, y) -> x * y;
		   System.out.println(calc.apply(3.0, 3.0));
		         
			}
}
