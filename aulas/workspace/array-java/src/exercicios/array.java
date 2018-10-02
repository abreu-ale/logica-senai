package exercicios;

import java.util.Arrays;

public class array {
	public static void main(String[] args) {
		double precos[] = new double[5];

		String euMeAm[] = { "no", "seu", "coração" };

		double[] salarios = new double[6];

		int[] numeros = { 1, 2, 3, 4 };
		
		System.out.println(Arrays.toString(euMeAm));
		
		System.out.println(numeros[2]);
		
		System.out.println(Arrays.toString(salarios));
		
		salarios[2] = 1200.40;
		System.out.println(Arrays.toString(salarios));
	}
}


		 