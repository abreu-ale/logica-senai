package exercicos;

public class PraEntender {
	public static void main(String[] args) {
		int x = -5;
		if (x > 0) {
			System.out.println(x + " É um numero positivo");
		} else if (x == 0 && x <= 0) {
			System.out.println("0 é zero, mané");
		} else {
			System.out.println(x + " É um numero negativo");
		}
	}
}
