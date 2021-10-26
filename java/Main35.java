package java;

import java.util.Scanner;

public class Main35 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int primeiroVar, segundoVar, terceiroVar, quartoVar, somaCD, somaAB, parA;

		System.out.println("Digite 4 valores do tipo inteiro:");
		primeiroVar = input.nextInt();
		segundoVar = input.nextInt();
		terceiroVar = input.nextInt();
		quartoVar = input.nextInt();

		somaCD = terceiroVar + quartoVar;
		somaAB = primeiroVar + segundoVar;
		parA = primeiroVar % 2;

		if (segundoVar > terceiroVar && quartoVar > primeiroVar && somaCD > somaAB && terceiroVar >= 0 && quartoVar >= 0
				&& parA == 0) {
			System.out.println("Valores aceitos");

		} else {
			System.out.println("Valores nao aceitos");
		}
	}

}
