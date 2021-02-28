import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double A, B, MEDIA;

        System.out.print("Entre com duas notas para saber a média: ");
        A = entrada.nextDouble();
        B = entrada.nextDouble();

        MEDIA = (3.5 * A + 7.5 * B) / 11;

        System.out.printf("MEDIA = %.5f\n", MEDIA);

    }

}