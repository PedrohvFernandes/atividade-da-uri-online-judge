package java;
import java.util.Locale;
import java.util.Scanner;

public class Main41 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		float x, y;// pode usar double

		System.out.println("Introduza dois valores X e Y as coordenadas:");
		x = input.nextFloat();
		y = input.nextFloat();

		if (x > 0 && y > 0) {// No primeiro quadrante tanto x como y s�o positivos
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {// No segundo quadrante x<0 e y>0
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {// No terceiro quadrante, ambos s�o negativos x<0 e y<0
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {// No quarto quadrante, x>0 e y<0
			System.out.println("Q4");
		} else if (x == y && y == 0) {// Se o ponto estiver na origem ou seja X=Y=0 n�o pertence a nenhum quadrante.
			System.out.println("Origem");
		} else if (x != 0 && y == 0) {// Semelhantemente, se estiver situado no eixo 0x ou no eixo 0y.,caso y=0 ou
										// x=0.
			System.out.println("Eixo X");
		} else if (y != 0 && x == 0) {// Semelhantemente, se estiver situado no eixo 0x ou no eixo 0y.,caso y=0 ou
										// x=0.
			System.out.println("Eixo Y");
		}
	}

}
