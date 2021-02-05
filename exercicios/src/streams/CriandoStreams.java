package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		//1ª forma de criar Streams, passando valores literais
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		// 2ª forma passando um Array
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};		
		Stream.of(maisLangs).forEach(print);
		
		// 3ª forma a partir de Array criar um Stream
		Arrays.stream(maisLangs).forEach(print);		
		Arrays.stream(maisLangs, 1, 4).forEach(print);
		
		//4ª forma a partir das collections
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		//Gerar Stream de forma infinita
		//Stream.generate(() -> "a").forEach(print);
		Stream.iterate(0, n -> n + 1).forEach(println);;
		
	}

}
