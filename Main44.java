import java.util.Scanner;

public class Main44 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira dois valores do tipo inteiro:");
		int primeiroNum = input.nextInt();
		int segundoNum = input.nextInt();

		if (primeiroNum * 1 == segundoNum || primeiroNum * 2 == segundoNum || primeiroNum * 3 == segundoNum
				|| primeiroNum * 4 == segundoNum || primeiroNum * 5 == segundoNum || primeiroNum * 6 == segundoNum
				|| primeiroNum * 7 == segundoNum || primeiroNum * 8 == segundoNum || primeiroNum * 9 == segundoNum
				|| primeiroNum * 10 == segundoNum) {
			System.out.println("Sao Multiplos");

		} else {
			System.out.println("Nao sao Multiplos");
		}

	}

}
