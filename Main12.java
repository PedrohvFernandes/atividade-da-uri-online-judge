import java.util.Scanner;

public class Main12 {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    double A, B, C, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO, pi = 3.14159;

    A = ler.nextDouble();
    B = ler.nextDouble();
    C = ler.nextDouble();

    TRIANGULO = (A * C) / 2;
    CIRCULO = Math.pow(C, 2) * pi;
    TRAPEZIO = ((A + B) * C) / 2;
    QUADRADO = Math.pow(B, 2);
    RETANGULO = A * B;

    System.out.printf("TRIANGULO: %.3f\n", TRIANGULO);
    System.out.printf("CIRCULO: %.3f\n", CIRCULO);
    System.out.printf("TRAPEZIO: %.3f\n", TRAPEZIO);
    System.out.printf("QUADRADO: %.3f\n", QUADRADO);
    System.out.printf("RETANGULO: %.3f\n", RETANGULO);

  }
}