package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Luna", "Luiza","Vini","Geisinha");
		
		System.out.println("Forma Tradicional");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		//foreach funcional
		System.out.println("\nLambda #01...");
		aprovados.forEach(nome -> System.out.println(nome + "!!"));
		
		System.out.println("\nMethod Reference #01...");
		aprovados.forEach(System.out::println);
		
		//foreach funcional
		System.out.println("\nLambda #02...");
		aprovados.forEach(nome -> meuNome(nome));
		
		System.out.println("\nMethod Reference #02...");
		aprovados.forEach(Foreach::meuNome);	
		}
		
	    static void meuNome(String nome) {
		System.out.println("Oi, meu nome é " + nome);
	}
}
