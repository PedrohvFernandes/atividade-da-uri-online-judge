import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double A, B, C, MEDIA;

        A = ler.nextDouble();
        B = ler.nextDouble();
        C = ler.nextDouble();

        MEDIA = (2 * A + 3 * B + 5 * C) / 10;

        System.out.printf("MEDIA = %.1f\n", MEDIA);

    }

}