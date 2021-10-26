package java;
import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double p1, p2, x1, y1, x2, y2, Distancia;

        x1 = ler.nextDouble();
        y1 = ler.nextDouble();
        x2 = ler.nextDouble();
        y2 = ler.nextDouble();

        Distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("%.4f\n", Distancia);

    }
}