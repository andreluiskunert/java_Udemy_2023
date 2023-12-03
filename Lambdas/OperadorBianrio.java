package Lambdas;

import java.util.function.BinaryOperator;

public class OperadorBianrio {
	public static void main(String[] args) {
		BinaryOperator<Double> media = 
				(Double n1, Double n2)	-> (n1 +n2) / 2;
				System.out.println(media.apply(9.8, 5.7));
				}

}
