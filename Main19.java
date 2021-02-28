import java.util.Scanner;

public class Main19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lerSegundos, horas, minutos;

		System.out.println("Digite o tempo de dura��o em segundos de um determinado evento em uma f�brica: ");
		lerSegundos = input.nextInt();// Segundos = 140.153
		System.out.println("O tempo de dura��o em segundos de um evento da f�brica: " + lerSegundos);

		// Segundos em horas: Quantos segundos tem uma hora? 1 minuto tem 60 segundos e
		// 1 hora tem 60 minutos 60x60=3600segundos,
		// então uma hora tem 3600segundos
		horas = lerSegundos / 3600;// 140.153/3600 = 38Horas (1min=60segs*1hora=60min=3600)

		// Total de segundos menos(-) o inverso do calculo anterior, em vez de dividir
		// por 3600 segundos vamos multiplicar,
		// nesse caso transformando Horas em Segundos 38H*3600S=136.800 segundos
		minutos = (lerSegundos - (horas * 3600)) / 60;// 38H*3600S = 140.153S-136.800S/60(1 min =60S)=55minutos

		// Pego os segundos, converto as horas em segundos, depois converto os minutos
		// para segundos
		lerSegundos = lerSegundos - (horas * 3600) - (minutos * 60);// 53Segundos

		System.out.println("H: " + horas + " M: " + minutos + " S: " + lerSegundos);
	}

}
