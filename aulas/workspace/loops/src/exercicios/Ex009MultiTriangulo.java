package exercicios;

public class Ex009MultiTriangulo {
	public static void main(String[] args) {
		String x = " ";
		int quantidades = 5;

		for (int i = 0; i <= quantidades; i++) {
			for (int linha = 0; linha < 3; linha++) {
				x += "*";
				System.out.println(x);

			}
			x = " ";
		}
	} 
}
