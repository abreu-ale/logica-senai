package exercicios;

public class EX008Diamante {
	public static void main(String[] args) {
		int x = 0;
		int tamanho = 9;
		for (int linha = 0; linha < tamanho; linha++) {
			for (int coluna = 0; coluna < tamanho; coluna++) {
				if (tamanho / 2 == coluna) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
