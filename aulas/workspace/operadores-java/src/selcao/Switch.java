package selcao;

public class Switch {
	public static void main(String[] args) {
		String passeio = "floresta";

		switch (passeio) {
		case "montanha":
			System.out.println("Bora escalar!");
			break;
		case "deserto":
			System.out.println("Leva uma agua");
			break;
		case "floresta":
			System.out.println("Vai l�, Tarzan");
			break;
		case "mar":
			System.out.println("Compra uma b�ia");
			break;
		default:
			System.out.println("Ah, bora assistir Netflix");
			break;

		}
	}
}
