package exercicos;

public class PraEntender {
	public static void main(String[] args) {
		int x = -5;
		if (x > 0) {
			System.out.println(x + " � um numero positivo");
		} else if (x == 0 && x <= 0) {
			System.out.println("0 � zero, man�");
		} else {
			System.out.println(x + " � um numero negativo");
		}
	}
}
