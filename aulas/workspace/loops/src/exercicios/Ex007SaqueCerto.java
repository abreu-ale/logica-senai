package exercicios;

public class Ex007SaqueCerto {
	public static void main(String[] args) {

		int[] cedulas = { 100, 50, 20, 10, 5, 2, 1 };
		int montante = 1233;

		for (int i = 0; i < cedulas.length; i++) {
			int quantidadeDeNotas = montante / cedulas[i];
			montante = montante - (quantidadeDeNotas * cedulas[i]);

			System.out.println("Notas de " + cedulas[i] + ": " + quantidadeDeNotas);

		}

	}
}
