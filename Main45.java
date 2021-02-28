import java.util.Locale;
import java.util.Scanner;

public class Main45 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double A, B, C, soma, aux;

		System.out.println("Insira 3 valores reais para ver se forma um tringulo ou n�o:");
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();

		if (B > A && B > C) {
			aux = A;
			A = B;
			B = aux;
		}
		if (C > A && C > B) {
			aux = A;
			A = C;
			C = aux;
		}
		if (A >= (B + C)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if ((A * A) == (B * B) + (C * C)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if ((A * A) > (B * B) + (C * C)) {
				System.out.println("TRIANGULO OBTUSANGULO");
				if (A == B && B == C && A == C) {
					System.out.println("TRIANGULO EQUILATERO");
				} else if (A == B || B == C || A == C) {
					System.out.println("TRIANGULO ISOSCELES");
				}
			}

			if ((A * A) < (B * B) + (C * C)) {
				System.out.println("TRIANGULO ACUTANGULO");
				if (A == B && B == C && A == C) {
					System.out.println("TRIANGULO EQUILATERO");
				} else if (A == B || B == C || A == C) {
					System.out.println("TRIANGULO ISOSCELES");
				}
			}
		}
	}
}
