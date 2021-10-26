package java;
import java.util.Scanner;

public class Main42 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int primeiroVar, segundoVar, terceiroVar;
		int auxPrime, auxSegun, auxTerce;
		int aux;
		System.out.println("Insira 3 valores do tipo Int");

		primeiroVar = input.nextInt();
		segundoVar = input.nextInt();
		terceiroVar = input.nextInt();

		// 7 21 -14
		auxPrime = primeiroVar;
		auxSegun = segundoVar;
		auxTerce = terceiroVar;

		if (auxPrime > auxSegun) {
			aux = auxPrime;
			auxPrime = auxSegun;
			auxSegun = aux;
		}
		if (auxPrime > auxTerce) {
			aux = auxPrime;
			auxPrime = auxTerce;
			auxTerce = aux;
		}
		if (auxSegun > auxTerce) {
			aux = auxSegun;
			auxSegun = auxTerce;
			auxTerce = aux;
		}

		System.out.println(auxPrime + "\n" + auxSegun + "\n" + auxTerce + "\n");

		System.out.println(primeiroVar + "\n" + segundoVar + "\n" + terceiroVar);
	}

}
