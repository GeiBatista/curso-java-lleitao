package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Interno i1 = new Interno("João", 36, "Aberto");
		Interno i2 = new Interno("José", 23, "semi-Aberto");
		Interno i3 = new Interno("Gilberto", 21, "Fechado");
		Interno i4 = new Interno("Olegario", 43, "Fechado");
		Interno i5 = new Interno("Celso", 18, "Aberto");
		Interno i6 = new Interno("Heber", 19, "Aberto");
		
		List<Interno> interno = Arrays.asList(i1,i2,i3,i4,i5,i6);
		
		Predicate<Interno> idade = i -> i.idade >= 20;
		Predicate<Interno> regime = r -> r.regime.equals("Aberto");
		Function<Interno, String> internos = i -> i.nome;
		
		interno.stream()
		.filter(idade)
		.filter(regime)
		.map(internos)
		.forEach(System.out::println);

	}

}
