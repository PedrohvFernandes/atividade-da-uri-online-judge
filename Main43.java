import java.util.Locale;
import java.util.Scanner;

public class Main43 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double A, B, C, soma;

		System.out.println("Insira 3 valores reais para ver se forma um tringulo ou n�o:");
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();

		if (B - C < A && A < B + C && A - C < B && B < A + C && A - B < C && C < A + B) {

			soma = A + B + C;
			System.out.printf("Perimetro = %.1f%n", soma);

		} else {
			soma = ((A + B) * C) / 2;
			System.out.printf("Area = %.1f%n", soma);
		}

	}

}
