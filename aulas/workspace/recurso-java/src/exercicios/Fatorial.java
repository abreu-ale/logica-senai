package exercicios;

public class Fatorial {
	public static void main(String[] args) {
		System.out.println(Fatorial.fatorar(5));

	}

	public static int fatorar(int n1) {
		if (n1 == 1) {
			System.out.print(n1 + " = ");
			return n1;
		} else {
			System.out.print(n1 + " * ");
			return n1 * fatorar(--n1);
		}
	}
}
