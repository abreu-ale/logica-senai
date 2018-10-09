package exercicios;

import java.io.InputStream;
import java.util.Scanner;

public class GeradorDeAbobrinha {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreve uma palavra ai cara");
		
		
		String palavras = entrada.nextLine();
		String[][] matrizPalavras = { 
				{ "Bode", "Madeira", "Pia", "" }, 
				{ "", "Não Pode", "Furado", "Mexe" },
				{ "na", "de", "com", "dentro" }, 
				{ "você", "eu", "nós", "alguém" } };
		
		System.out.println(palavras);
		
		System.out.println("escreva mais uma");
		
		palavras = entrada.nextLine();
		
		String carro = matrizPalavras[1][3];
		System.out.println(matrizPalavras);
	}

}
