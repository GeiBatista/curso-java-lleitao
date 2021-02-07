package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) 
	{
		
		Consumer<? super Integer> println = System.out::println;

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Function<Integer, String> binario = b -> b.toBinaryString(b);
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> reverter = r -> Integer.parseInt(r, 2);
		
		nums.stream()
		.map(binario)
		.map(inverter)
		.map(reverter)
		.forEach(println);
	}

}
