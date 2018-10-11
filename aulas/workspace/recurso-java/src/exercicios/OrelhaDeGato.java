package exercicios;

public class OrelhaDeGato {
	public static void main(String[] args) {

		System.out.println(OrelhaDeGato.quantidade(2));
	}

	public static int quantidade(int n1) {
		if (n1 == 0) {
			return 0;

		} else {
			return 2 + quantidade(n1 - 1);
		}
	}
}
