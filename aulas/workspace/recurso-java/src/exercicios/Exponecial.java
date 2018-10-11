package exercicios;

public class Exponecial {
	public static void main(String[] args) {

		System.out.println(Exponecial.calcular(2, 32));
	}

	public static int calcular(int n1, int n2) {
		if (n2 == 0) {
			System.out.print(" = ");
			return 1;
		} else {
			System.out.print(n1 + " * ");
			return n1 * calcular(n1, --n2);

		}

	}
}
