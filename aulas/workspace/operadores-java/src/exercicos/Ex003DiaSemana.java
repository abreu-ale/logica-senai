package exercicos;

import java.util.Random;

public class Ex003DiaSemana {
	public static void main(String[] args) {
		int n = new Random().nextInt (7) + 1;
		
		switch (n) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira (Droga!)");
			break;
		case 3:
			System.out.println("Ter�a-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira ( TBT )");
			break;
		case 6:
			System.out.println("Sexta-Feira (Sextou)");
			break;
		case 7:
			System.out.println("Sabado");
			break;
	}
	}
}
