import java.util.Scanner;
import java.util.Locale;

public class Main38 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner input = new Scanner(System.in);
		int id, quanti;
		double preco = 0;
		
		System.out.println("CODIGO -   ESPECIFICA��O   - PRE�O");
		System.out.println("1      -   Cachorro Quente - R$4.00");
		System.out.println("2      -   X-Salada        - R$4.50");
		System.out.println("3      -   X-Bacon         - R$5.00");
		System.out.println("4      -   Torrada simples - R$2.00");
		System.out.println("5      -   Refrigerante    - R$1.50");
		System.out.println("Coloque o codigo do produto e a quantidade que deseja:");
		
		
		id = input.nextInt();
		quanti = input.nextInt();
		
		if(id == 1) {
			preco = 4.00;
		}else if(id == 2){
			preco = 4.50;
		}else if(id == 3) {
			preco = 5.00;
		}else if(id == 4) {
			preco = 2.00;
		}else if(id == 5) {
			preco = 1.50;
		}else {
			System.out.println("Esse Id/Produto n�o existe no nosso servi�o");
		}
		System.out.printf("Total: R$ %.2f%n",quanti * preco);
	}

}
