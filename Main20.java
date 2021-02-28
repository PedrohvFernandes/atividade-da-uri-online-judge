import java.util.Scanner;

public class Main20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idadePessoaDias, ano, mes;

		System.out.println("Um valor inteiro correspondente � idade de uma pessoa em dias: ");
		idadePessoaDias = input.nextInt();
		System.out.println("� idade de uma pessoa em dias: " + idadePessoaDias);

		ano = idadePessoaDias / 365;
		idadePessoaDias = idadePessoaDias % 365;

		mes = idadePessoaDias / 30;
		idadePessoaDias = idadePessoaDias % 30;

		// outra maneira de imprimir
		/*
		 * String formatada Sysoutprintf o %d serve para reservar o espaço, voltado para
		 * o valor que esta armazenado na nossa variavel o %n serve para pular uma
		 * linha, poderia usar o \n, so que a string esta sendo formatada, ent�o se usa
		 * o %n
		 */
		System.out.printf("%d ano(s)%n", ano);
		System.out.printf("%d mes(es)%n", mes);
		System.out.printf("%d dia(s)%n", idadePessoaDias);

		// outra maneira de imprimir
		/*
		 * System.out.println(ano+ " ano(s)\n"); System.out.println(mes+ " mes(es)");
		 * System.out.println(idadePessoaDias+ " dia(s)");
		 */

	}

}
