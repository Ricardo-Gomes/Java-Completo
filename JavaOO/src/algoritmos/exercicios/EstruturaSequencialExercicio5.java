package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaSequencialExercicio5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int qtd1, qtd2, codigoPeca1, codigoPeca2;
		double valorUnitario1, valorUnitario2, valorAPagar;
		
		System.out.println("Digite o c?digo de pe?as 1: ");
		codigoPeca1 = scanner.nextInt();

		System.out.println("Digite a quantidade de pe?as 1: ");
		qtd1 = scanner.nextInt();
		
		System.out.println("Digite o valor unit?rio das pe?as 1: ");
		valorUnitario1 = scanner.nextDouble();
		
		System.out.println("Digite o c?digo de pe?as 2: ");
		codigoPeca2 = scanner.nextInt();
		
		System.out.println("Digite a quantidade de pe?as 2: ");
		qtd2 = scanner.nextInt();
		
		System.out.println("Digite o valor unit?rio das pe?as 2: ");
		valorUnitario2 = scanner.nextDouble();
		
		valorAPagar = valorUnitario1 * qtd1 + valorUnitario2 * qtd2;
		
		System.out.println("VALOR A PAGAR: " + valorAPagar);
		
		scanner.close();
	}

}
