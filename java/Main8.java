package java;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int Funcionario, Horas;
        double ValorH, result;

        Funcionario = ler.nextInt();
        Horas = ler.nextInt();
        ValorH = ler.nextDouble();

        result = Horas * ValorH;

        System.out.println("NUMBER = " + Funcionario);
        System.out.printf("SALARY = U$ %.2f\n", result);

    }
}