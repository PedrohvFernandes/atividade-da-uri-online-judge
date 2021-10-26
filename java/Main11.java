package java;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double pi = 3.14159, result;
        int Raio;

        Raio = ler.nextInt();

        result = (4 / 3.0) * pi * (Math.pow(Raio, 3));

        System.out.printf("VOLUME = %.3f\n", result);

    }

}