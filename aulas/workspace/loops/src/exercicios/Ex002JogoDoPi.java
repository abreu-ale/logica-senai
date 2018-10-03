package exercicios;

public class Ex002JogoDoPi {
	public static void main(String[] args) {
		int i = 0;

		while (i <= 20) {
			if (i % 4 == 0) {
				System.out.println("pi");
			} else {
				System.out.println(i);
			}
			++i;
		}
	}
}