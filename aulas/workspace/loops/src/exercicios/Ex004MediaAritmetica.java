package exercicios;

public class Ex004MediaAritmetica {
	public static void main(String[] args) {

		int[] notas1 = { 5, 4, 6 };
		int i = 0;
		int acumulador = 0;

		for (i = 0; i < 3; ++i) {
			int x = notas1[i];

			acumulador += x;
			System.out.println(acumulador);
		}
		if (acumulador / notas1.length >= 5) {
			System.out.println("Passou");
		} else {
			System.out.println("Errouu");
		}

	}

}
