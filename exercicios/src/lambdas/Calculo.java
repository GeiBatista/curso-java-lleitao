package lambdas;

@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);
	
	default String metodoDefault() {
		return "Testando método padrão";
	}
	
	static String metodoStatic() {
		return "Testando método static";
	}
	
}
