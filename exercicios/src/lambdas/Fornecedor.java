package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		Supplier<List<String>> umalista = () -> Arrays.asList("Vini", "Lú", "Luna", "Geisi" );
		System.out.println(umalista.get());
	}
}
