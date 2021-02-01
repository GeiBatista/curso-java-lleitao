package lambdas;

public class CalculoTestImplLamba {

	public static void main(String[] args) {
		
		Calculo calculo = (x , y) -> {return x + y;};
		System.out.println(calculo.executar(2, 3));
		
		//Retorno implicito
		calculo = (x, y) ->  x * y;
		System.out.println(calculo.executar(2, 3));
		
		System.out.println(calculo.metodoDefault());
		System.out.println(Calculo.metodoStatic());
		
	}

}
