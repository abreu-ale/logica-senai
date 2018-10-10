package exercicios;

public class CalculosPraVoce {
	public static void main(String[] args) {

		System.out.println(CalculosPraVoce.soma(2.0, 4.0));
		System.out.println(CalculosPraVoce.multiplicacao(5.0, 2.0));
		double resultado = CalculosPraVoce.multiplicacao(5.0, 2.0);
		CalculosPraVoce.subtracao(10.0, 2.0);
	}

	public static double soma(double num1, double num2) {
		return num1 + num2;
	}

	public static double multiplicacao(double num1, double num2) {

		return num1 * num2;

	}

	public static double divisao(double num1, double num2) {

		return num1 / num2;
	}

	public static void subtracao(double num1, double num2) {
		System.out.println(num1 - num2);
	}

}
