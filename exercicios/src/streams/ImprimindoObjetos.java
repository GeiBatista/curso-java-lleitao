package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Vini", "Lú", "Luna", "Geisi");

		System.out.println("Usando for...");
		for (int i = 0; i < aprovados.size(); i++) 
			System.out.println(aprovados.get(i));
		
		System.out.println("\nUsando forEach...");
		for (String nome : aprovados)
			System.out.println(nome);
		
		System.out.println("\nUsando Iterator...");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println("\nUsando Stream...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
	}

}
