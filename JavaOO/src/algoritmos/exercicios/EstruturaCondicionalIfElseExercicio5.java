package algoritmos.exercicios;

import java.util.Scanner;

public class EstruturaCondicionalIfElseExercicio5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int escolha, qtd ;
		double total;
		
		System.out.println("C�digo - 1 | Especifica��o - Cachorro Quente | Pre�o - R$ 4,00 ");
		System.out.println("C�digo - 2 | Especifica��o - X-Salada        | Pre�o - R$ 4,50 ");
		System.out.println("C�digo - 3 | Especifica��o - X-Bacon         | Pre�o - R$ 5,00 ");
		System.out.println("C�digo - 4 | Especifica��o - Torrada Simples | Pre�o - R$ 2,00 ");
		System.out.println("C�digo - 5 | Especifica��o - Refrigerante    | Pre�o - R$ 1,50 ");

		
		System.out.println("Escolha a sua primeira op��o: ");
		escolha = scanner.nextInt();

		System.out.println("Escolha a quantidade: ");
		qtd = scanner.nextInt();
		
		if (escolha == 1) {
			total = qtd * 4;
			System.out.println("Valor a pagar: R$" + total);
		} else if (escolha == 2) {
			total = qtd * 4.5;
			System.out.println("Valor a pagar: R$" + total);
		} else if (escolha == 3) {
			total = qtd * 5;
			System.out.println("Valor a pagar: R$" + total);
		} else if  (escolha == 4) {
			total = qtd * 2;
			System.out.println("Valor a pagar: R$" + total);
		} else {
			total = qtd * 1.5;
			System.out.println("Valor a pagar: R$" + total);
		}

		scanner.close();
		
	}

}
