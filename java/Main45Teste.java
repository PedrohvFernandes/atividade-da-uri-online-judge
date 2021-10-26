package java;
import java.util.Locale;
import java.util.Scanner;

public class Main45Teste {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Insira 3 valores reais para ver se forma um tringulo ou n�o:");
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		double aux;

		if (B > A && B > C) {
			aux = A;
			A = B;
			B = aux;
		} else if (C > A) {
			aux = A;
			A = C;
			C = aux;
		}

		if (A >= (B + C)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if (A * A == (B * B) + (C * C))
				System.out.println("TRIANGULO RETANGULO");
			if (A * A > (B * B) + (C * C))
				System.out.println("TRIANGULO OBTUSANGULO");
			if (A * A < (B * B) + (C * C))
				System.out.println("TRIANGULO ACUTANGULO");
			if (A == B && A == C)
				System.out.println("TRIANGULO EQUILATERO");
			if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A))
				System.out.println("TRIANGULO ISOSCELES");
		}

	}

}
