import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int Num1, Num2, Num3, MaiorAB, MaiorC;

        Num1 = ler.nextInt();
        Num2 = ler.nextInt();
        Num3 = ler.nextInt();

        MaiorAB = (Num1 + Num2 + Math.abs(Num1 - Num2)) / 2;// o metodo math.abs transforma o numero negativo para
                                                            // positivo.
        MaiorC = (MaiorAB + Num3 + Math.abs(MaiorAB - Num3)) / 2;

        System.out.println(MaiorC + " eh o maior");

    }

}