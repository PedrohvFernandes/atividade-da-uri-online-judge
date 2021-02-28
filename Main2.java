import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double n = 3.14159, area, raio;

        raio = ler.nextDouble();
        area = Math.pow(raio, 2) * n;

        System.out.printf("A=%.4f \n", area);

    }

}
