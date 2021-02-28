import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X;
        double Y, KM;

        X = input.nextInt();
        Y = input.nextDouble();

        KM = X / Y;

        System.out.printf("%.3f km/l\n", KM);

    }
}