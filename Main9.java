import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String Nome;
        double salario, totalVendas, result;

        System.out.print("Insira o nome do vendedor: ");
        Nome = ler.nextLine();
        System.out.print("Qual o seu salario fixo: ");
        salario = ler.nextDouble();
        System.out.print("O ganho total de suas vendas: ");
        totalVendas = ler.nextDouble();

        System.out.print(
                "O seu salario vai ser somado com o toal de suas vendas e multiplicado por 15 % de comissão sobre suas vendas, obetendo o \n");
        result = salario + totalVendas * 0.15;

        System.out.printf("TOTAL = R$ %.2f\n", result);

    }
}