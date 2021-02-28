import java.util.Locale;
import java.util.Scanner;

public class Main21 {
	public static void main(String[] args) {
		double valorInformado;
		int valor;

		Locale.setDefault(Locale.US);// setando as configura��es padr�o dos US(estados unidos)
		Scanner input = new Scanner(System.in);

		valorInformado = input.nextDouble();
		System.out.println("NOTAS: ");
		// cast
		valor = (int) valorInformado / 100;// na hora que fizer a divis�o, que no caso � um tipo double por um inteiro,
											// o cast pega somente a parte do inteiro
		// e desconsidera a parte fracionada. Ex:573.75/100 = 5.7375 = o cast vai pegar
		// so o 5, com isso a variavel valor receber o inteiro 5
		// %d espa�o reservado para um valor inteiro
		System.out.printf("%d nota(s) de R$ 100.00%n", valor);
		valorInformado = valorInformado % 100.0;// pegando o resto

		valor = (int) valorInformado / 50;
		System.out.printf("%d nota(s) de R$ 50.00%n", valor);
		valorInformado = valorInformado % 50.0;

		valor = (int) valorInformado / 20;
		System.out.printf("%d nota(s) de R$ 20.00%n", valor);
		valorInformado = valorInformado % 20.0;

		valor = (int) valorInformado / 10;
		System.out.printf("%d nota(s) de R$ 10.00%n", valor);
		valorInformado = valorInformado % 10.0;

		valor = (int) valorInformado / 5;
		System.out.printf("%d nota(s) de R$ 5.00%n", valor);
		valorInformado = valorInformado % 5.0;

		valor = (int) valorInformado / 2;
		System.out.printf("%d nota(s) de R$ 2.00%n", valor);
		valorInformado = valorInformado % 2.0;

		// por baixo dos panos a gente esta tratando os centavos como se fossem notas,
		// mas pro usuario ele n�o percebe:
		// ent�o a nota de 1 real � como a de 100 reais, a de 50 centavos � a de 50
		// reais...
		// nesse caso o valorInformado aqui � o resto, o resto � a parte de moedas, com
		// isso multiplicamos o resto * 100
		valorInformado = valorInformado * 100.0;

		System.out.println("MOEDAS: ");

		valor = (int) valorInformado / 100;
		// %d espa�o reservado para um valor inteiro
		System.out.printf("%d moeda(s) de R$ 1.00%n", valor);
		valorInformado = valorInformado % 100.0;

		valor = (int) valorInformado / 50;
		System.out.printf("%d moeda(s) de R$ 0.50%n", valor);
		valorInformado = valorInformado % 50.0;

		valor = (int) valorInformado / 25;
		System.out.printf("%d moeda(s) de R$ 0.25%n", valor);
		valorInformado = valorInformado % 25.0;

		valor = (int) valorInformado / 10;
		System.out.printf("%d moeda(s) de R$ 0.10%n", valor);
		valorInformado = valorInformado % 10.0;

		valor = (int) valorInformado / 5;
		System.out.printf("%d moeda(s) de R$ 0.05%n", valor);
		valorInformado = valorInformado % 5.0;

		valor = (int) valorInformado / 1;
		System.out.printf("%d moeda(s) de R$ 0.01%n", valor);
		valorInformado = valorInformado % 1.0;
	}
}
