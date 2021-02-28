import java.util.Scanner;
import java.util.Locale;

public class Main36 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		// A //B //C
		double primeiroValor, segundoValor, terceiroValor;

		System.out.println("Insira 3 valores do tipo double para fazer a bascara e depois as raizes(ponto flutuante)");
		primeiroValor = input.nextDouble();
		segundoValor = input.nextDouble();
		terceiroValor = input.nextDouble();

		if ((primeiroValor == 0) || (segundoValor * segundoValor - 4 * primeiroValor * terceiroValor < 0)) {

			System.out.println("Impossivel calcular");
		} else {
			double bascara = Math.sqrt(segundoValor * segundoValor - 4 * primeiroValor * terceiroValor);
			double R1 = (-segundoValor + bascara) / (2 * primeiroValor);
			double R2 = (-segundoValor - bascara) / (2 * primeiroValor);
			System.out.printf("R1 = %.5f%n", R1);
			System.out.printf("R2 = %.5f%n", R2);
		}

	}

}
