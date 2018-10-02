package exercicios;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class Ex006ParImpar {
	public static void main(String[] args) throws InterruptedException {

		// Preparando a aplicação para receber o input do teclado
		InputStream entradaTeclado = System.in;
		Scanner respostaUsuario = new Scanner(entradaTeclado);

		// Declarando as variaveis necessarias
		int numeroMaquina = 0;
		int numeroUsuario = 0;
		String escolhaUsuario = "";

		// mensagem de inicio
		System.out.println("Bora jogar um par ou impar aí, meu consagrado?");

		// 1) Caso a resposta seja "Sim"
		String aceite = respostaUsuario.nextLine();
		if (aceite.equalsIgnoreCase("sim") || aceite.equalsIgnoreCase("ok")) {
			
				System.out.println("Combinado! Vamos lá");

				System.out.println("Voce quer PAR ou IMPAR?");

				escolhaUsuario = respostaUsuario.nextLine();

				if (escolhaUsuario.equalsIgnoreCase("Par")) {
					System.out.println("vou de IMPAR, então");
				} else {
					System.out.println("Voude PAR, então");
				}

				System.out.println("Escolha um numero de 0 a 10");

				if (respostaUsuario.hasNextInt()) {
					numeroUsuario = respostaUsuario.nextInt();

					numeroMaquina = new Random().nextInt(10);

					Thread.sleep(1000);

					System.out.println("Ok!  Escolhi o " + numeroMaquina);

					int soma = numeroUsuario + numeroMaquina;
					System.out.println("Somando tudo deu " + soma);

					if (soma % 2 == 0 && escolhaUsuario.equalsIgnoreCase("par")) {
						System.out.println("Voce venceu");

					} else if (soma % 2 != 0 && escolhaUsuario.equalsIgnoreCase("impar")) {
						System.out.println("Voce venceu!");
					} else {
						System.out.println("Venci");
					}
				}
			} else {
				System.out.println("Voce nao sabe brincar ...");
			}
			System.out.println("firmeza! Falou!");
		}
	}

