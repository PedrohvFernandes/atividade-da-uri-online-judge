import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int codigo1peca, codigo2peca, nummerodepeca1, nummerodepeca2;
        double valor1peca, valor2peca, VALOR;

        codigo1peca = ler.nextInt();
        nummerodepeca1 = ler.nextInt();
        valor1peca = ler.nextDouble();

        codigo2peca = ler.nextInt();
        nummerodepeca2 = ler.nextInt();
        valor2peca = ler.nextDouble();

        VALOR = valor1peca * nummerodepeca1 + valor2peca * nummerodepeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", VALOR);

    }
}