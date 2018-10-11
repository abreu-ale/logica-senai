package exercicios;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println(Fibonacci.sequencia(15));
		int inicio = 3;
		for (int i = 0; i <= inicio; i++) {
			System.out.println(sequencia(i));
			
		}
	}

	public static int sequencia(int n) {
		if (n == 1 || n == 2) {
			return 1;

		} else {

			return sequencia(n - 1) + sequencia(n - 2);
		}
	}
}