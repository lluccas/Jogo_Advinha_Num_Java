package jogoSorteador;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Random gerador = new Random();

		int numSort = gerador.nextInt(50) + 1;
		int num;
		int tentativa = 0;
		boolean acertou = false;

		while (acertou == false) {
			System.out.println("Digite um número e veja se acertou: ");
			num = s.nextInt();
			s.nextLine();

			if (numSort < num) {
				System.out.println("Quase um pouco menos");
				acertou = false;
			}
			if (numSort > num) {
				System.out.println("Um pouco mais");
				acertou = false;

			}
			tentativa++;

			if (numSort == num) {
				System.out.println("Parábens você acertou o númerp da sorte: " + numSort + " e foi em " + tentativa
						+ " tentativas");
				acertou = true;
			}

		}

	}

}
