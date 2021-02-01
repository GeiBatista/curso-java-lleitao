package lambdas;

public class CalculoTestImplPolimorfismo {

	public static void main(String[] args) {

		//Usando polimorfismo
		Calculo calculo = new Somar();		
		System.out.println(calculo.executar(2, 3));
		
		calculo = new Multiplicar();		
		System.out.println(calculo.executar(2, 3));
	}

}
