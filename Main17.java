import java.util.Scanner;

public class Main17 {
    public static void main(String args[]) {

        Scanner ler = new Scanner(System.in);
        int totalDeKlometros;

        int TG = ler.nextInt();
        int VM = ler.nextInt();

        totalDeKlometros = TG * VM;

        double totalLitosGastos = totalDeKlometros / 12.0;

        System.out.printf("%.3f%n", totalLitosGastos);

    }

}
