package algoritmos.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class Aula38OperadoresAtribuicaoCumulativa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner  = new Scanner(System.in);
		
		int minutos;
		double conta = 50.0;
		
		System.out.println("Escreva a quantidade de minutos: ");
		minutos = scanner.nextInt();
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2;
		}
		
		System.out.println("Valor a ser pago é: R$ " + conta);
		scanner.close();
	}
}
