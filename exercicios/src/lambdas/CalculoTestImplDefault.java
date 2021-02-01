package lambdas;

public class CalculoTestImplDefault {

	public static void main(String[] args) {

		//Implementação simples
		Calculo soma = new Somar();
		System.out.println(soma.executar(2, 3));
		
		Calculo multiplicacao = new Multiplicar();
		System.out.println(multiplicacao.executar(2, 3));		
		
	}

}
