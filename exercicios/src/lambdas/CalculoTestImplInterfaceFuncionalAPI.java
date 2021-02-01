package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTestImplInterfaceFuncionalAPI {

	public static void main(String[] args) {
		
		BinaryOperator<Double> calculo = (x , y) -> {return x + y;};
		System.out.println(calculo.apply(2.0, 3.0));
		
		//Retorno implicito
		calculo = (x, y) ->  x * y;
		System.out.println(calculo.apply(2.0, 3.0));
						
	}

}
