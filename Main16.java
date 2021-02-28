import java.util.Scanner;

public class Main16 {
    public static void main(String args[]) {

        Scanner ler = new Scanner(System.in);
        int D, T;

        D = ler.nextInt();
        T = (D * 60) / 30;

        System.out.println(T + " minutos");

    }
}