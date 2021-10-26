package java;
import java.util.Locale;
import java.util.Scanner;

public class Main40 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		 
		
		float n1, n2, n3, n4, media, exame, mediaFinal;
		
		System.out.println("Escreva quatro notas do aluno abaixo:");
		n1 = input.nextFloat();
		n2 = input.nextFloat();
		n3 = input.nextFloat();
		n4 = input.nextFloat();
		
		// pontos medios: 2, 3, 4 e 1 = 10
		media = ((n1 * 2)+(n2 * 3)+(n3 * 4)+(n4 * 1))/10;
		
		System.out.printf("Media: %.1f%n",media);
		
		if(media >= 7.0) {
			
			System.out.println("Aluno aprovado.");
			
		}else if(media >=5.0 && media <= 6.9) {
			
			System.out.println("Aluno em exame.");
			exame = input.nextFloat();
			System.out.printf("Nota do exame: %.1f%n",exame);
			mediaFinal = (media + exame)/2;
		
		if(mediaFinal >=5.0) {
			System.out.println("Aluno aprovado.");
			
		}else if(mediaFinal <= 4.9) {
			System.out.println("Aluno reprovado.");
		}
		
			System.out.printf("Media final: %.1f%n",mediaFinal);
			
		}else if(media < 5.0) {
			
			System.out.println("Aluno reprovado.");
			
		}
					
	}
		
}

