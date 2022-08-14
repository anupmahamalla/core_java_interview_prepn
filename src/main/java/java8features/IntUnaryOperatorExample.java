package java8features;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class IntUnaryOperatorExample {

	public static void main(String args[]) 
	{ 
		IntUnaryOperator op = a -> 2 * a;
		System.out.println(op.applyAsInt(12)); 
		
		
		UnaryOperator <String> twoOfMe = s -> s + s;
		Function<String, Integer> convertMe = s -> Integer.parseInt (s);

		UnaryOperator <Integer> twiceMe = n -> 2*n;

		IntUnaryOperator doubleMe = n -> 2*n;

		int a = twoOfMe.andThen(convertMe).andThen(twiceMe).apply ("2");

        System.out.println(a);

		//int b = twoOfMe.andThen(convertMe).andThen(doubleMe).apply ("2"); not worked 
		
	} 
}
